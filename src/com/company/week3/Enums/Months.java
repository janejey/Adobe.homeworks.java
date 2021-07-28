package com.company.week3.Enums;

public enum Months {
    JANUARY(1),
    FEBRUARY(2),
    MARCH(3),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JULY(7),
    AUGUST(8),
    SEPTEMBER(9),
    OCTOBER(10),
    NOVEMBER(11),
    DECEMBER(12);

    private final int value;

    Months(int value) {

        this.value = value;
    }

    public static Months getMonths(int index) {
        return Months.values()[index-1];
    }

    public static void main(String[] args) {
        System.out.println(Months.getMonths(2));
    }


}
