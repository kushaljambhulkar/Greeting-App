package com.example.greeting.service;

import com.example.greeting.model.Greeting;
import com.example.greeting.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GreetingService {
    @Autowired
    GreetingRepository greetingRepository;
    public Greeting printMessages(Greeting greeting){
        return greeetingRepository.save(new Greeting(greeting.getId(),greeting.getName(),greeting.getMessages()));
        //        return greetingRepository.save(greeting);
    }


}