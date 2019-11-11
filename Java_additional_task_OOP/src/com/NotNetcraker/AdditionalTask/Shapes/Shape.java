package com.NotNetcraker.AdditionalTask.Shapes;

import java.util.Objects;

public class Shape {
    private String color = "red";
    private boolean filled = true;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public Shape(){};

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shape)) return false;
        Shape shape = (Shape) o;
        return filled == shape.filled &&
                color.equals(shape.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, filled);
    }
}
