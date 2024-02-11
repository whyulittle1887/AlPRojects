package com.example.springboottutorial;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Routes
{
    @GetMapping("/abc")
    public String abc(@RequestParam String name, @RequestParam int age)
    {
        return String.format("%1s is %2s years old.", name, age);
    }
}
