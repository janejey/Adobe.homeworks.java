package com.company.week4.task3.Clock;

public class FastClock implements Clock {
    int seconds = 0;
    @Override
    public void start() {
        try {
            long startTime = System.currentTimeMillis();
            while (true) {
                Thread.sleep(500);
                seconds++;
                if (System.currentTimeMillis() - startTime >= 10000) break;
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
