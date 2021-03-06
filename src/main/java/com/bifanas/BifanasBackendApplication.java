package com.bifanas;

import nu.pattern.OpenCV;
import org.apache.commons.io.FileUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;

@SpringBootApplication
public class BifanasBackendApplication {

    public static void main(String[] args) throws IOException {
        OpenCV.loadShared();
        FileUtils.cleanDirectory(new File("public"));
        SpringApplication.run(BifanasBackendApplication.class, args);
    }
}
