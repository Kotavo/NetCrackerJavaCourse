package com.notnetcracker.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.notnetcracker")
public class Task2SpringBootStarter {
    public static void main(String[] args) {
        SpringApplication.run(Task2SpringBootStarter.class, args);
    }
}
