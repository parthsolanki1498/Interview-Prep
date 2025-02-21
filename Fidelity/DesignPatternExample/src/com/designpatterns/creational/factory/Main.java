package com.designpatterns.creational.factory;

public class Main {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape("CIRCLE");
        circle.draw();

        Shape square = ShapeFactory.getShape("SQUARE");
        square.draw();
    }
}
