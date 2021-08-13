package com.company.week4.task3.Clock;

public class FastClock implements Clock {
    int seconds = 0;
    @Override
    public void start() {
        try {
            long startTime = System.currentTimeMillis();
            while (true) {
                seconds++;
                if (System.currentTimeMillis() - startTime >= 5000) break;
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
