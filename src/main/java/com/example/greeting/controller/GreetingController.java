package com.example.greeting.controller;

import com.example.greeting.model.Greeting;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @PostMapping("/post")
    public String greetingMessege(@RequestBody Greeting greeting)
    {
        return greeting.getId() + " " + greeting.getName() + " " + greeting.getMessege();
    }
}
