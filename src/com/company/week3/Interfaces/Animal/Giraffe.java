package com.company.week3.Interfaces.Animal;

public class Giraffe implements LandAnimal {
    @Override
    public void isBreathing() {
        System.out.println("Giraffe is breathing.");
    }

    @Override
    public void isRunning() {
        System.out.println("Giraffe is running.");
    }
}
