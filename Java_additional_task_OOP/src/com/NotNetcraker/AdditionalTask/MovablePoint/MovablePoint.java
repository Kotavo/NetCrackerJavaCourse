package com.NotNetcraker.AdditionalTask.MovablePoint;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(){};

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] speedXY = new float[2];
        speedXY[0] = xSpeed;
        speedXY[1] = ySpeed;
        return speedXY;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.ySpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint move(){
        this.setX(this.getX() + xSpeed);
        this.setY(this.getY() + ySpeed);
        return this;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Speed= (" + xSpeed +
                ", " + ySpeed +
                " )" ;
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
