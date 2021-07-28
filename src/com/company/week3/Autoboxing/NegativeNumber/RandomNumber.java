package com.company.week3.Autoboxing.NegativeNumber;

import java.util.Random;

public class RandomNumber {
    static Random random = new Random();
    static int autoUnboxing(Integer num) {
        return Math.abs(num);
    }

    public static void main(String[] args) {
        Integer number = random.nextInt(100) * -1;
        System.out.println(autoUnboxing(number));
    }
}
