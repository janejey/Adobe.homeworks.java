package com.company.week12.task2;

import java.util.*;

public class ListAndSetAssertion {
    public static <T extends Iterable> boolean checkTheSize(T ds, int size) {
        for (Object o : ds) {
            size--;
        }
        if (size == 0) {
            return true;
        } else {
            throw new InputMismatchException("Sizes are not matching");
        }
    }

    public static void main(String[] args) {
        List<String> ds1 = new ArrayList<>();
        List<Integer> ds2 = new LinkedList<>();
        Set<String> ds3 = new HashSet<>();
        Set<Integer> ds4 = new TreeSet<>();
        for (int i = 0; i < 15; i++) {
            ds1.add("a" + i);
        }
        for (int i = 0; i < 20; i++) {
            ds2.add(i);
        }
        for (int i = 0; i < 10; i++) {
            ds3.add("b" + i);
        }
        for (int i = 0; i < 30; i++) {
            ds4.add(i);
        }
        try {
            System.out.println("The first data structure's size is " + checkTheSize(ds1, 15));
        } catch (InputMismatchException e) {
            System.out.println("The size is false");
        }
        ;
        try {
            System.out.println("The second data structure's size is " + checkTheSize(ds2, 26));
        } catch (InputMismatchException e) {
            System.out.println("The size is false");
        }
        try {
            System.out.println("The third data structure's size is " + checkTheSize(ds3, 15));
        } catch (InputMismatchException e) {
            System.out.println("The size is false");
        }
        try {
            System.out.println("The fourth data structure's size is " + checkTheSize(ds4, 30));
        } catch (InputMismatchException e) {
            System.out.println("The size is false");
        }
    }
}
