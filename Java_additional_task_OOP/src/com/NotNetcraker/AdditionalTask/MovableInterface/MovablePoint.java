package com.NotNetcraker.AdditionalTask.MovableInterface;

import java.util.Objects;

public class MovablePoint  implements Movable{
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    @Override
    public void moveUp() {
        this.y += ySpeed;
    }

    @Override
    public void moveDown() {
        this.y -= ySpeed;
    }

    @Override
    public void moveLeft() {
        this.x -= xSpeed;
    }

    @Override
    public void moveRight() {
        this.x += xSpeed;
    }

    @Override
    public String toString() {
        return  "( " + x +
                ", " + y +
                " ), Speed ( " + xSpeed +
                ", " + ySpeed +
                " )";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MovablePoint)) return false;
        MovablePoint point = (MovablePoint) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
