package com.company.week4.task3;

import java.util.Scanner;

public class Printer {
    public static void specialPrint(Object o) {
        System.out.println("************************************");
        System.out.println(o.toString());
        System.out.println("************************************");
    }

    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        int decideType = input.nextInt();
        switch (decideType) {
            case 1: new FastClock().start();
            break;
            case 2: new SlowClock().start();
            break;
            default: throw new RuntimeException();
        }
    }
}
