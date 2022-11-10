package com.example.greeting.repo;

import com.example.greeting.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface GreetingRepository extends JpaRepository <Greeting,Integer> {

}
