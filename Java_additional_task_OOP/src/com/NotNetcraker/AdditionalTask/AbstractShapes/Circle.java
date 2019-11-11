package com.NotNetcraker.AdditionalTask.AbstractShapes;

import java.util.Objects;

public class Circle extends Shape {
    protected double radius ;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(){};

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{ " +
                "radius= " + radius +
                ", color= " + super.getColor() +
                ", filled= " + super.isFilled() +
                " }";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0 &&
                this.color.equals(circle.color) &&
                this.filled == circle.filled;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius,color,filled);
    }
}


