package com.company.week3.Polymorphism.Shape;

public class RightTriangle implements Shape{
    double base;
    double height;

    public RightTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateAreas() {
        return (base * height) / 2;
    }

    @Override
    public String getName() {
        return "Right Triangle";
    }
}
