package com.NotNetCracker;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x, int y, int widht, int height) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = x1 + widht;
        this.y2 = y1 + height;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getWidht(){
        return Math.abs(x2-x1);
    }

    public int getHeight(){
        return Math.abs(y2-y1);
    }

    public boolean collides(Ball ball){
        return ball.getX() + ball.getRadius() < x2 && ball.getX() + ball.getRadius() > x1 &&
                ball.getY() + ball.getRadius() < y2 && ball.getY() + ball.getRadius() > y1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Container)) return false;

        Container container = (Container) o;

        if (x1 != container.x1) return false;
        if (y1 != container.y1) return false;
        if (x2 != container.x2) return false;
        return y2 == container.y2;
    }

    @Override
    public int hashCode() {
        int result = x1;
        result = 31 * result + y1;
        result = 31 * result + x2;
        result = 31 * result + y2;
        return result;
    }

    @Override
    public String toString() {
        return "Container [ " +
                "(" + x1 +
                "," + y1 +
                "),(" + x2 +
                "," + y2 +
                ") ]";
    }
}
