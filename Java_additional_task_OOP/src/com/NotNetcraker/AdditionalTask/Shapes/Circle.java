package com.NotNetcraker.AdditionalTask.Shapes;

public class Circle extends Shape {
    private double radius = 1.0;

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

    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }
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
}
