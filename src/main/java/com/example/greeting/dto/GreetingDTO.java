package com.example.greeting.dto;

public class GreetingDTO {
    private int id;
    private String name;
    private String messege;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMessege(String messege) {
        this.messege = messege;
    }

    public String getMessege() {
        return messege;
    }
}
