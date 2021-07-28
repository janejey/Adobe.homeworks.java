package com.company.week3.Polymorphism.Shape;

public class Square implements Shape{
    double sideSize;

    public Square(double sideSize) {
        this.sideSize = sideSize;
    }

    @Override
    public double calculateAreas() {
        return sideSize * sideSize;
    }

    @Override
    public String getName() {
        return "Square";
    }
}
