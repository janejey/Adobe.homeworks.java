package com.company.week4.task3.Processor;

import com.company.week4.task3.Clock.Decimal;

public class ArmProcessor implements Processor {
    public static final int delay = 2000;

    @Override
    public String calculateBinary(long decimal) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } return new Decimal().getBinaryNum(decimal);
    }
}
