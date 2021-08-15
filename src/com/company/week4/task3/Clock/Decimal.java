package com.company.week4.task3.Clock;

public class Decimal {
    public String getBinaryNum(long decimal) {
        String binaryNum = "";
        while (decimal > 0) {
            binaryNum = ((int) decimal % 2) + binaryNum;
            decimal /= 2;
        }
        return binaryNum;
    }
}
