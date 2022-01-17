package com.bifanas;

import nu.pattern.OpenCV;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BifanasBackendApplication {

    public static void main(String[] args) {
        OpenCV.loadShared();
        SpringApplication.run(BifanasBackendApplication.class, args);
    }
}
