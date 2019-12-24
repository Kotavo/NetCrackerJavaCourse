package com.notnetcracker.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.notnetcracker")
public class Task1SpringBootStarter {
    public static void main(String[] args) {
        SpringApplication.run(Task1SpringBootStarter.class, args);
    }
}
