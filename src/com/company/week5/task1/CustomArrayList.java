package com.company.week5.task1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CustomArrayList<T> {
    Object[] arr;
    int capacity;
    static final int maxCapacity = 1000;
    int currentIndex;

//    public CustomArrayList() {
//        this.arr = Array.newInstance(,);
//        this.capacity = 5;
//        this.currentIndex = 0;
//    }


    public CustomArrayList() {
        this.arr = new Object[50];
        this.capacity = 50;
        this.currentIndex = 0;
    }

    public void addAtTheBeginning(T element) throws Exception {
        addAtTheIndex(element, 0);
    }

    public void addAtTheEnd(T element) throws Exception {
        addAtTheIndex(element, currentIndex);
    }

    public void addAtTheIndex(T element, int index) throws Exception {
        if (index > currentIndex + 1) {
            throw new Exception("Invalid Index");
        }

        Object[] tmpArr = this.arr;
        T tmpValue = element;
        currentIndex++;
        if (this.currentIndex == arr.length - 1) {
            if (capacity == maxCapacity) {
                currentIndex--;
                throw new Exception("Full memory");
            }
            capacity += 50;
            tmpArr = new Object[capacity];
        }

        for (int i = 0; i <= currentIndex; i++) {
            if (i < index) {
                tmpArr[i] = this.arr[i];
            } else {
                T tmp = tmpValue;
                tmpValue = (T) arr[i];
                tmpArr[i] = tmp;
            }
        }
        this.arr = tmpArr;
    }

    public void deleteElement(int element) throws Exception {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(element)) {
                arr[i] = null;
                break;
            }
        }
        if (index == -1) {
            throw new Exception("Element is not found.");
        }
    }

    public void deleteIndex(int index) throws Exception {
        if (index < 0 || index > 1000) {
            throw new Exception("Invalid index");
        } else {
            for (int i = 0; i <= arr.length; i++) {
                if (i == index) {
                    arr[i] = null;
                }
            }
        }
    }

    public int search(T element) {
        for (int i = 0; i <= currentIndex; i++) {
            if (arr[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public void bubbleSort() {
        long startTime = System.currentTimeMillis();
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[i] == null || arr[j] == null) {
                    continue;
                }
                if ((int) arr[j - 1] > (int) arr[j]) {
                    temp = (int) arr[j];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(System.currentTimeMillis() - startTime + " millis for Bubble Sort");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < currentIndex; i++) {
            if (arr[i] == null) {
                continue;
            }
            sb.append(arr[i].toString() + " ");
        }
        return sb.toString();
    }
}
