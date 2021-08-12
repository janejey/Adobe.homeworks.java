package com.company.week4.task3;

import java.util.concurrent.TimeUnit;

public class FastClock implements Clock {
    int seconds = 0;
    @Override
    public void start() {
        try {
            long startTime = System.currentTimeMillis();
            while (true) {
                TimeUnit.MILLISECONDS.sleep(500);
                seconds++;
                if (System.currentTimeMillis() - startTime >= 5000) break;
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
