package com.company.week3.Interfaces.Animal;

public class Frog implements WaterAnimal, LandAnimal {

    @Override
    public void isBreathing() {
        System.out.println("Frog is breathing.");
    }

    @Override
    public void isRunning() {
        System.out.println("Frog is jumping.");
    }

    @Override
    public void isSwimming() {
        System.out.println("Frog is swimming.");
    }
}
