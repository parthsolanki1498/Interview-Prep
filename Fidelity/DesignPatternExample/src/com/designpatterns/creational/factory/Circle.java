package com.designpatterns.creational.factory;

class Circle implements Shape {
    @SuppressWarnings("override")
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}