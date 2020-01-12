package com.notnetcracker.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.notnetcracker")
public class SpringBootStarterMailSender {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootStarterMailSender.class,args);
    }
}
