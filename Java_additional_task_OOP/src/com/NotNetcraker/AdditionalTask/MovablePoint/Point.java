package com.NotNetcraker.AdditionalTask.MovablePoint;

import java.util.Objects;

public class Point {
    private float  x = 0.0f;
    private float  y = 0.0f;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Point(){};

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY() {
        float[] XY = new float[2];
        XY[0] = x;
        XY[1] = y;
        return XY;
    }
    @Override
    public String toString() {
        return "( " +
                x +
                ", " + y +
                " )";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point point = (Point) o;
        return Float.compare(point.x, x) == 0 &&
                Float.compare(point.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
