package com.redis.redis_demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash("Students") // Redis Hash tipinde oluşturulacak
public class Students implements Serializable {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String eMail;

    public Students(String id, String firstName, String lastName, String eMail) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
    }

    @Override
    public String toString() {
        return "Students [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", eMail=" + eMail + "]";
    }


}
