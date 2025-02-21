package com.designpatterns.creational.factory;

public class ShapeFactory {
    public static Shape getShape(String shapeType) {
        if ("CIRCLE".equalsIgnoreCase(shapeType)) {
            return new Circle();
        } else if ("SQUARE".equalsIgnoreCase(shapeType)) {
            return new Square();
        }
        return null;
    }
}
