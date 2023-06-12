package com.example.newpro.config;

import org.springframework.boot.info.BuildProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

@Configuration
public class GitConfig {

    @Bean
    public BuildProperties buildProperties() {
        return new BuildProperties(new Properties());
    }
}