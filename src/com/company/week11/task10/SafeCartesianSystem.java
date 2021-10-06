package com.company.week11.task10;

public class SafeCartesianSystem {
    private Integer x;
    private Integer y;

    public synchronized void setXY (Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }
    public synchronized Integer[] XY () {
        return new Integer[]{this.x, this.y};
    }
}
