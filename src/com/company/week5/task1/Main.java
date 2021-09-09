package com.company.week5.task1;

public class Main {
    public static void main(String[] args) throws Exception {
        CustomArrayList <Integer> a = new CustomArrayList<Integer>();
        a.addAtTheBeginning(5);
        a.addAtTheBeginning(4);
        a.addAtTheBeginning(3);
        a.addAtTheBeginning(5);
        a.addAtTheBeginning(1);
        a.addAtTheBeginning(2);
        a.addAtTheIndex(10,3);
        a.addAtTheEnd(100);
        System.out.println(a);
        System.out.println(a.search(10));
        System.out.println(a);
        a.bubbleSort();
        System.out.println(a);
        a.deleteIndex(1);
        System.out.println(a);
    }
}
