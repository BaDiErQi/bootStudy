package com.example.bootstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BootstudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootstudyApplication.class, args);
    }

}

