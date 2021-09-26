package com.company.week11.task7;

import java.util.ArrayList;
import java.util.List;

public class SharedList {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int j = 1; j <= 500; j++) {
                        synchronized (list) {
                            list.add(j);
                        }
                    }
                }
            }).start();
        }
        Thread.sleep(1000);
        System.out.println(list.size());
    }
}
