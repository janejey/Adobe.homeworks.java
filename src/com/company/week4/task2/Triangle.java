package com.company.week4.task2;

import java.util.Objects;

public class Triangle {
    Point point1;
    Point point2;
    Point point3;

    public Triangle(Point point1, Point point2, Point point3) {
        AssertionUtils.assertNotNull(point1);
        AssertionUtils.assertNotNull(point2);
        AssertionUtils.assertNotNull(point3);
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }
    public Triangle(Triangle triangle) {
        this(new ImmutablePoint(triangle.point1), new ImmutablePoint(triangle.point2), new ImmutablePoint(triangle.point3));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "point1=" + point1 +
                ", point2=" + point2 +
                ", point3=" + point3 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return (point1.equals(triangle.point1) && point2.equals(triangle.point2) && point3.equals(triangle.point3)) ||
                (point1.equals(triangle.point2) && point2.equals(triangle.point1) && point3.equals(triangle.point1)) ||
                (point1.equals(triangle.point3) && point2.equals(triangle.point1) && point3.equals(triangle.point2));
    }
}
