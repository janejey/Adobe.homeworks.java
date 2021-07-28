package com.company.week3.Enums;

public enum Directions {
    NORTH,
    WEST,
    SOUTH,
    EAST;


    private static void printAllValues() {
        System.out.println(NORTH);
        System.out.println(WEST);
        System.out.println(SOUTH);
        System.out.println(EAST);
    }

    public static void main(String[] args) {
        Directions.printAllValues();
    }
}