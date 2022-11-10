package com.example.greeting.controller;

import com.example.greeting.model.Greeting;
import com.example.greeting.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class GreetingController {
    @Autowired
    GreetingService greetingService;
    @PostMapping(value = "/post")
    public Greeting greetingMesseges(@RequestBody Greeting greeting)
    {
        return greetingService.printMessages(greeting);
    }

}
