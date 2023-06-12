package com.example.newpro.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hi")
public class Demo {

    @GetMapping
    public String sayHello() {
        return "Hello, World!";
    }



}
