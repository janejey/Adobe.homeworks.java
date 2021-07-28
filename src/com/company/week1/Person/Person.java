package com.company.week1.Person;

public class Person {
    public static void main(String args[]) {
        Person a = new Person(1980, 1, 1);
        System.out.println(a.GetAge());
    }


    private static int startYear = 1970;

    private String name;
    private final long birthdayInMilliseconds;

    public Person(int year, int month, int day) {
        birthdayInMilliseconds = GetMilliseconds(year, month, day);
    }

    public int GetAge() {
        long ageInMilliseconds = System.currentTimeMillis() - birthdayInMilliseconds;
        long ageInDays = (ageInMilliseconds / (long) (24 * 3600 * 1000));
        return (int) ageInDays / 365;
    }

    private static long GetMilliseconds(int year, int month, int day) {
        int days = (year - startYear) * 365 + GetDaysSinceStartOfYear(month, day);
        return (long) days * 24 * 3600 * 1000;
    }

    private static int GetDaysSinceStartOfYear(int month, int day) {
        int[] monthDays = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int days = 0;
        for (int i = 0; i < month - 1; i++) {
            days += monthDays[i];
        }
        days += day;

        return days;
    }


}

