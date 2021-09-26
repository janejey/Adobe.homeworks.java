package com.company.week11.task6;

public class UnsafeThread implements Car{
    public static int numOfSeats = 6;
    private String[] passengerSeats = new String[6];
    private int size;
    @Override
    public void add(String passengerName) throws Exception {
        if(size > numOfSeats) {
            throw new Exception("There are not seats over 6");
        }
        passengerSeats[size] = passengerName;
    }

    @Override
    public void printPassengerNames() {
        for(int i = 0; i < numOfSeats; i++) {
            System.out.println(passengerSeats[i]);
        }
    }
}
