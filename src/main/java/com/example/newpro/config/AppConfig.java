package com.example.newpro.config;

import org.springframework.boot.actuate.info.GitInfoContributor;
import org.springframework.boot.info.GitProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import java.util.Properties;

@Configuration
@PropertySource("classpath:git.properties")
public class AppConfig {


    @Bean
    public GitInfoContributor gitInfoContributor(GitProperties gitProperties){
        return new GitInfoContributor(gitProperties);
    }
}
