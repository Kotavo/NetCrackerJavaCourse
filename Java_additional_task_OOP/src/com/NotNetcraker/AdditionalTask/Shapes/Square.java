package com.NotNetcraker.AdditionalTask.Shapes;

public class Square extends Rectangle{
    public Square(double side, String color, boolean filled) {
        super.setWidth(side);
        super.setLength(side);
        super.setColor(color);
        super.setFilled(filled);
    }

    public Square(double side) {
        setWidth(side);
        setLength(side);
    }

    public Square() {
    }

    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    public void setWidth(double side){
        super.setWidth(side);
    }

    public void setLength(double side){
        super.setLength(side);
    }

    public double getArea(){
        return Math.pow(getSide(),2);
    }

    public double getPerimeter(){
        return 4 * getSide();
    }

    @Override
    public String toString() {
        return "Square{ " +
                "side= " + getSide() +
                ", color= " + super.getColor() +
                ", filled= " + super.isFilled() +
                " }";
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
