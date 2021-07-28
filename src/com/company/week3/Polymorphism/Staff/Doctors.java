package com.company.week3.Polymorphism.Staff;

public class Doctors implements Staff{
    @Override
    public void work() {
        System.out.println("We are saving lives.");
    }
}
