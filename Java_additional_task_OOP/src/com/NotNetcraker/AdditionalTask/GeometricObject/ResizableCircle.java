package com.NotNetcraker.AdditionalTask.GeometricObject;

public class ResizableCircle extends Circle implements Resizable{
    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        this.radius = radius + radius * percent/100;
    }
}
