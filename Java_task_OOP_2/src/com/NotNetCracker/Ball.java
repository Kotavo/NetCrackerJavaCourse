package com.NotNetCracker;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        if(direction == 90 || direction == -90){
            this.xDelta = 0;
            this.yDelta = speed;
        }
        else{
            if (direction == 0 || direction == 180 || direction == -180){
                this.xDelta = speed;
                this.yDelta = 0;
            }
            else{
                this.xDelta = (float)(speed * (float)Math.cos(Math.toRadians(direction)));
                this.yDelta = (float)(speed * (float)Math.sin(Math.toRadians(direction)));
            }
        }

    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getxDelta() {
        return xDelta;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void move(){
        x+=xDelta;
        y+=yDelta;
    }

    public void reflectHorizontal(){
        xDelta = -xDelta;
    }

    public void reflectVertical(){
        yDelta = -yDelta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ball)) return false;

        Ball ball = (Ball) o;

        if (Float.compare(ball.x, x) != 0) return false;
        if (Float.compare(ball.y, y) != 0) return false;
        return radius == ball.radius;
    }

    @Override
    public int hashCode() {
        int result = (x != +0.0f ? Float.floatToIntBits(x) : 0);
        result = 31 * result + (y != +0.0f ? Float.floatToIntBits(y) : 0);
        result = 31 * result + radius;
        return result;
    }

    @Override
    public String toString() {
        return "Ball[ " +
                "(" + x +
                "," + y +
                "), speed = (" + xDelta +
                "," + yDelta +
                ") ]";
    }
}
