package com.example.greeting.model;

public class Greeting {
    private String id;
    private String name;
    private String messege;

    public Greeting(String id, String name, String messege) {
        this.id = id;
        this.name = name;
        this.messege = messege;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
