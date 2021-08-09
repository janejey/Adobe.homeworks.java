package com.company.week4.task2;

public class AssertionUtils {
    public static void assertEquals(int val1, int val2) {
        if(val1 != val2) {
            throw new RuntimeException("They are not the same");
        }

    }
    public static void assertEquals(double val1, double val2) {
        if(val1 != val2) {
            throw new RuntimeException("They are not the same");
        }

    }
    public static void assertEquals(String val1, String val2) {
        if(val1.equals(val2)) {
            throw new RuntimeException("They are not the same");
        }

    }
    public static void assertEquals(boolean val1, boolean val2) {
        if(val1 != val2) {
            throw new RuntimeException("They are not the same");
        }

    }
    public static void assertNotNull (Object obj) {
        if(obj == null) {
            throw new RuntimeException("Object is null.");
        }
    }
    public static void assertObjectEquals(Object val1, Object val2) {
        if(!val1.equals(val2)) {
            throw new RuntimeException("They are not the same");
        }

    }

    public static void main(String[] args) {
        ImmutablePoint test1 = new ImmutablePoint();
        Point p1 = test1.shiftDown();
        System.out.println(p1);
        ImmutablePoint test2 = new ImmutablePoint(p1);
        System.out.println(test2);
        System.out.println(test2.shiftDown());
        Object t = ColoredTriangle.class;
        System.out.println(t);
        System.out.println(t.getClass());
        Triangle triangle1 = new Triangle(p1, test2, test1);
        Triangle triangle2 = new Triangle(test2, test1, p1);
        System.out.println(triangle1.equals(triangle2));
    }
}
