package com.NotNetCracker;

import java.util.Objects;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint(){}

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int[] getXY(){
        int[] result = new int[2];
        result[0] = this.x;
        result[1] = this.y;
        return result;
    }

    public double distance(int x, int y){
        return (Math.sqrt(Math.pow(x - this.x,2) + Math.pow(y - this.y,2)));
    }

    public double distance(MyPoint another){
        return (Math.sqrt(Math.pow(another.x - this.x,2) + Math.pow(another.y - this.y,2)));
    }

    public double distance(){
        return (Math.sqrt((x * x + y * y)));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyPoint)) return false;
        MyPoint myPoint = (MyPoint) o;
        return x == myPoint.x &&
                y == myPoint.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "(" + x +"," + y +')';
    }
}
