package com.example.newpro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.info.GitProperties;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
//@EnableConfigurationProperties(GitProperties.class)
//@EnableScheduling
public class NewProApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewProApplication.class, args);
    }

}
