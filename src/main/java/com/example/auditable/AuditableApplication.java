package com.example.auditable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class AuditableApplication {
    public static void main(String[] args){
        SpringApplication.run(AuditableApplication.class, args);
    }
}
