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
    @GetMapping("/getMessege/{id}")
    public Optional<Greeting> findGreeting(@PathVariable int id){
        return greetingService.findGreeting(id);
    }
    @GetMapping(value = "/allGreeting")
    public List<Greeting> allGreeting(){
        return greetingService.allGreeting();
    }
    @PutMapping(value = "/update/{id}")
    public Greeting editMesseges(@PathVariable int id,@RequestParam(value = "messege") String messege,
                                 @RequestParam(value = "name") String name){
        return (greetingService.editMessages(id,messege,name));
    }
    @DeleteMapping(value = "/delete/{id}")
    public void deleteGreeting(@PathVariable int id){
        greetingService.deleteGreeting(id);
    }
}
