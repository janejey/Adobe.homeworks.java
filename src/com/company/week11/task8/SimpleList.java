package com.company.week11.task8;

public interface SimpleList <T> {
    void add(T item) throws Exception;
    int getSize();
    T get(int index) throws Exception;
}
