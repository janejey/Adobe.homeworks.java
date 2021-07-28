package com.company.week3.Polymorphism.Shape;

public class Rectangle implements Shape{
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateAreas() {
        return width * height;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }
}
