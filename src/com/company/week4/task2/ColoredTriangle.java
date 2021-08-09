package com.company.week4.task2;

import java.util.Objects;

public class ColoredTriangle extends Triangle {
    final Color color;

    public ColoredTriangle(Point point1, Point point2, Point point3, Color color) {
        super(point1, point2, point3);
        this.color = color;
    }

    public ColoredTriangle(Triangle triangle, Color color) {
        super(triangle);
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColoredTriangle{" +
                "color=" + color +
                ", point1=" + point1 +
                ", point2=" + point2 +
                ", point3=" + point3 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (!(o instanceof Triangle)) return false;
        if (!super.equals(o)) return false;
        if(o.getClass().equals(Triangle.class)) return true;

        ColoredTriangle that = (ColoredTriangle) o;
        return color == that.color;
    }
}
