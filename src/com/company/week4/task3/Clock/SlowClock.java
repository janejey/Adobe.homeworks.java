package com.company.week4.task3.Clock;

public class SlowClock implements Clock {
    int seconds = 0;
    @Override
    public void start() {
        try {
            long startTime = System.currentTimeMillis();
            while (true) {
                seconds++;
                if (System.currentTimeMillis() - startTime >= 20000) break;
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
