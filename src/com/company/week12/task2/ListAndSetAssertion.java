package com.company.week12.task2;

import java.util.*;

public class ListAndSetAssertion {
    public static <T extends Iterable> boolean checkTheSize (T ds, int size) throws MisMatchSizeException {
        for(Object o : ds) {
            size--;
        }
        if(size == 0) {
            return true;
        } else {
            throw new MisMatchSizeException("Sizes are not matching");
        }
    }
    public static void main(String[] args){
        List<String> ds1 = new ArrayList<>();
        List<Integer> ds2 = new LinkedList<>();
        Set<String> ds3 = new HashSet<>();
        Set<Integer> ds4 = new TreeSet<>();
        for(int i = 0; i < 15; i++) {
            ds1.add("a" + i);
        }
        for(int i = 0; i < 20; i++) {
            ds2.add(i);
        }
        for(int i = 0; i < 10; i++) {
            ds3.add("b" + i);
        }
        for(int i = 0; i < 30; i++) {
            ds4.add(i);
        }
        try {
            System.out.println(checkTheSize(ds1, 15));
        } catch (MisMatchSizeException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(checkTheSize(ds2, 25));
        } catch (MisMatchSizeException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(checkTheSize(ds3, 40));
        } catch (MisMatchSizeException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(checkTheSize(ds4, 30));
        } catch (MisMatchSizeException e) {
            e.printStackTrace();
        }
    }
}
