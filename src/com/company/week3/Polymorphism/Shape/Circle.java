package com.company.week3.Polymorphism.Shape;

public class Circle implements Shape {
    double radius;
    final double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateAreas() {
        return pi * radius * radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }
}
