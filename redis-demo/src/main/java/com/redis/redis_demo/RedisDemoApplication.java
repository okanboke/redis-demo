package com.redis.redis_demo;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RedisDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisDemoApplication.class, args);
	}

	@Bean
	public ApplicationRunner runner(StudentsRepository studentsRepository) {
		return args -> {
			Students students = new Students(
					"123123123", "demo1", "demo1","demo@demo.com");
			studentsRepository.save(students);
			Students retrievedStudents = studentsRepository.findById("123123123").get();
			System.out.println(retrievedStudents.toString());
		};
	}
}
