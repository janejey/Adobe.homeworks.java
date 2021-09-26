package com.company.week11.task6;

public class SafeThread implements Car {
    public static final int numOfSeats = 6;
    private String[] passengerSeats = new String[6];
    private int size;
    public synchronized int getSize() {
        return size;
    }
    @Override
    public synchronized void add(String passengerName) throws Exception {
        if(size > numOfSeats) {
            throw new Exception("There are not seats over 6");
        }
        passengerSeats[size] = passengerName;
        size++;
    }

    @Override
    public synchronized void printPassengerNames() {
        for (int i = 0; i < numOfSeats; i++) {
            System.out.println(passengerSeats[i]);
        }
    }
}
