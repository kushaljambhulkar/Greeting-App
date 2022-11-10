package com.example.greeting.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Greeting {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String messege;
    public Greeting(int id, String name, String messege) {
        this.id = id;
        this.name = name;
        this.messege = messege;
    }
    public Greeting(){

    }
    public Greeting(int incrementAndGet, String messege){
        this.id = incrementAndGet;
        this.messege = messege;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMessege() {
        return messege;
    }
    public void setMessege(String messege) {
        this.messege = messege;
    }
}
