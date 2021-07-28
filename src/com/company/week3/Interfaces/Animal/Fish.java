package com.company.week3.Interfaces.Animal;

public class Fish implements WaterAnimal {

    @Override
    public void isBreathing() {
        System.out.println("Fish is breathing in another way.");
    }

    @Override
    public void isSwimming() {
        System.out.println("Fish is swimming.");
    }
}
