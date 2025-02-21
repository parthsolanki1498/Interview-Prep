package com.designpatterns.behavioral.observer;

public class User implements Observer {
    
    @SuppressWarnings("FieldMayBeFinal")
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received: " + message);
    }

}
