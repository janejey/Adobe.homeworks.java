package com.company.week4.task2;

import java.util.Objects;

public class ImmutablePoint implements Point{
    int Y;
    int X;

    public ImmutablePoint(){
        X = 0;
        Y = 0;
    }

    public ImmutablePoint(int x, int y) {
        X = x;
        Y = y;
    }

    public ImmutablePoint (Point point) {
        X = point.getX();
        Y = point.getY();
    }

    public Point  shiftLeft() {
        return new ImmutablePoint(X-1, Y);
    }
    public Point  shiftRight() {
        return new ImmutablePoint(X+1, Y);
    }
    public Point  shiftUp() {
        return new ImmutablePoint(X, Y+1);
    }
    public Point  shiftDown() {
        return new ImmutablePoint(X, Y-1);
    }
    public Point copy() {
        return new ImmutablePoint(this);
    }

    @Override
    public int getX() {
        return X;
    }

    @Override
    public int getY() {
        return Y;
    }

    @Override
    public String toString() {
        return "(" + X + ", " + Y + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ImmutablePoint that = (ImmutablePoint) o;
        return Y == that.Y && X == that.X;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Y, X);
    }
}
