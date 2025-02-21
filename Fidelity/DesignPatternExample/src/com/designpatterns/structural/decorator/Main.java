package com.designpatterns.structural.decorator;

public class Main {
    
    public static void main(String[] args) {
        
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " - $ " + coffee.cost());

        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " - $ " + coffee.cost());
    }
}
