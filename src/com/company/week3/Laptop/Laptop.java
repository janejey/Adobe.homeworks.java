package com.company.week3.Laptop;

public class Laptop {
    private static int publicCounter = 0;
    private static int protectedCounter = 0;

    public Laptop(int a) {
        publicCounter++;
    }

    protected Laptop() {
        protectedCounter++;
    }

    public static void print() {
        System.out.println("Public Counter Called " + publicCounter + " time");
        System.out.println("Protected Counter Called " + protectedCounter + " time");
    }

    public static void setPublicCounter(int publicCounter) {
        Laptop.publicCounter = publicCounter;
    }

    public static void setProtectedCounter(int protectedCounter) {
        Laptop.protectedCounter = protectedCounter;
    }
    public static void main(String[] args) {
        Laptop laptop = new Laptop(1);
        SubLaptop sublaptop = new SubLaptop();
        Laptop.print();
    }
}