package com.NotNetcraker.AdditionalTask.GeometricObject;

public class ResizableCircle extends Circle implements Resizable{
    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        this.radius = radius + radius * percent/100;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
