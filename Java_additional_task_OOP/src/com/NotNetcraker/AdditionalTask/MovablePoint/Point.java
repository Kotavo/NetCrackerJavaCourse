package com.NotNetcraker.AdditionalTask.MovablePoint;

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
}
