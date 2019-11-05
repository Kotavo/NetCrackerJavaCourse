package com.NotNetCracker;

import java.util.Objects;

public class MyTriangle {
    private MyPoint v1 = new MyPoint();
    private MyPoint v2 = new MyPoint();
    private MyPoint v3 = new MyPoint();

    public MyTriangle(int x1, int y1,int x2, int y2, int x3, int y3) {
        this.v1.setXY(x1,y1);
        this.v2.setXY(x2,y2);
        this.v2.setXY(x3,y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public double getPerimeter(){
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }

    public String getType(){
        if(v1.distance(v2) == v2.distance(v3) && v1.distance(v2) == v3.distance(v1)){
            return "Equilateral";
        }
        if(v1.distance(v2) == v2.distance(v3) || v1.distance(v2) == v3.distance(v1) || v2.distance(v3) == v3.distance(v1)){
            return "Isosceles";
        }
        return "Scalene";
    }

    @Override
    public String toString() {
        return "MyTriangle{" +
                "v1=" + v1 +
                ", v2=" + v2 +
                ", v3=" + v3 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyTriangle)) return false;
        MyTriangle triangle = (MyTriangle) o;
        return v1.equals(triangle.v1) &&
                v2.equals(triangle.v2) &&
                v3.equals(triangle.v3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(v1, v2, v3);
    }
}
