package com.NotNetcraker.AdditionalTask.MovableInterface;

import java.util.Objects;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public String toString() {
        return "MovableCircle{ center= "  + center +
                ", radius= " + radius +
                " }";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MovableCircle)) return false;
        MovableCircle circle = (MovableCircle) o;
        return radius == circle.radius &&
                center.equals(circle.center);
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, center);
    }
}
