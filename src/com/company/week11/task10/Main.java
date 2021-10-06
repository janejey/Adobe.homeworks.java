package com.company.week11.task10;

public class Main {
    public static void main(String[] args) {
        SafeCartesianSystem safeCartesianSystem = new SafeCartesianSystem();
        safeCartesianSystem.setXY(1, 1);
        new Thread(new Runnable() {
            @Override
            public void run() {
                safeCartesianSystem.setXY(-1, -1);
            }
        }).start();
        System.out.println(safeCartesianSystem.XY()[0] + ":" + safeCartesianSystem.XY()[1]);
    }
}
