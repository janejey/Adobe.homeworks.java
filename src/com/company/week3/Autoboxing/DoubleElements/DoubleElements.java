package com.company.week3.Autoboxing.DoubleElements;

import java.util.ArrayList;
import java.util.List;

public class DoubleElements {
    final static double pi = 3.14;
    public static void main(String[] args) {
        List<Double> elements = new ArrayList<>();
        elements.add(pi);
        double num = elements.get(0);
        System.out.println(num);
    }
}
