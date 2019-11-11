package com.NotNetcraker.AdditionalTask.AbstractShapes;

import java.util.Objects;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(){}

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea(){
        return width * length;
    }

    @Override
    public double getPerimeter(){
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle{ " +
                "width= " + width +
                ", length= " + length +
                ", color= " + super.getColor() +
                ", filled= " + super.isFilled() +
                " }";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.width, width) == 0 &&
                Double.compare(rectangle.length, length) == 0 &&
                this.color.equals(rectangle.color) &&
                this.filled == rectangle.filled;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, length, color, filled);
    }
}
