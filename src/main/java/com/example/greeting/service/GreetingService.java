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
        return greetingRepository.save(greeting);
    }

    public Optional<Greeting> findGreeting(int id) {
        return greetingRepository.findById(id);
    }

    public List<Greeting> allGreeting() {
        return greetingRepository.findAll();
    }

    public Greeting editMessages(int id, String messages,String name) {
        Optional<Greeting> greeting = greetingRepository.findById(id);
        if (greeting.get().getId() == id){
            greeting.get().setMessege(messages);
            greeting.get().setName(name);
            return greetingRepository.save(greeting.get());
        }else {
            return null;
        }
    }

    

}