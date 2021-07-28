package com.company.week3.Polymorphism.Staff;

public class Main {
    public static void main(String[] args) {
        Staff programmer = new Programmers();
        Staff doctor = new Doctors();
        programmer.work();
        doctor.work();
    }
}
