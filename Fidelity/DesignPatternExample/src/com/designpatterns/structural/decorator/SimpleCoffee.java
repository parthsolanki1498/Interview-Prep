package com.designpatterns.structural.decorator;

public class SimpleCoffee implements Coffee {

    public String getDescription() {
        return "Simple Coffee";
    }

    public double cost() {
        return 5.0;
    }
    
}
