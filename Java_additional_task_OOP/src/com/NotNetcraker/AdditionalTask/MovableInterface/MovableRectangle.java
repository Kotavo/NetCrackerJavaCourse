package com.NotNetcraker.AdditionalTask.MovableInterface;

import java.util.Objects;

public class MovableRectangle extends MovablePoint implements Movable {
    private MovablePoint topLeft;
    private MovablePoint buttomRight;

    public MovableRectangle(int x1,int y1, int x2, int y2, int xSpeed, int ySpeed){
        this.topLeft = new MovablePoint(x1,y1,xSpeed,ySpeed);
        this.buttomRight = new MovablePoint(x2,y2,xSpeed,ySpeed);
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        buttomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        buttomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        buttomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        buttomRight.moveRight();
    }

    @Override
    public String toString() {
        return "MovableRectangle{ " +
                "topLeft= " + topLeft +
                ", buttomRight=" + buttomRight +
                " }";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MovableRectangle)) return false;
        if (!super.equals(o)) return false;
        MovableRectangle that = (MovableRectangle) o;
        return topLeft.equals(that.topLeft) &&
                buttomRight.equals(that.buttomRight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), topLeft, buttomRight);
    }
}
