package com.designpatterns.structural.decorator;

public class MilkDecorator implements Coffee {

    @SuppressWarnings("FieldMayBeFinal")
    private Coffee coffee;

    public MilkDecorator(Coffee coffee) {
        this.coffee = coffee;
    }    

    @SuppressWarnings("override")
    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return coffee.cost() + 2.0;
    }
}
