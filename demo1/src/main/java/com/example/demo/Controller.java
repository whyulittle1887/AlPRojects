package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller
{

    @GetMapping("/")
    public String index()
    {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/test")
    public String test()
    {
        return "Greetings from Spring Boot Test Page!";
    }

}