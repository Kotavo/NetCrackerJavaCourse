package com.NotNetCracker;

import java.util.Objects;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    public MyComplex(){}

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        if(imag >= 0) {
            return "(" + real + "+" + imag + "i)";
        }
        return "(" + real + imag + "i)";
    }
    public boolean isReal(){
        return this.real != 0.0;
    }

    public  boolean isImaginary(){
        return this.imag != 0.0;
    }

/*   I am not sure which of the methods is correct. Is this or the method below?
    @Override
    public boolean equals(MyComplex another) {
        if (this == another) return true;
        if (another == null || getClass() != another.getClass()) return false;
        return Double.compare(this.real, another.real) == 0 &&
                Double.compare(this.imag, another.imag) == 0;
    }
*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyComplex complex = (MyComplex) o;
        return Double.compare(complex.real, real) == 0 &&
                Double.compare(complex.imag, imag) == 0;
    }

    public boolean equals(double real,double imag){
        return Double.compare(this.real, real) == 0 &&
                Double.compare(this.imag, imag) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getReal());
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getImag());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public double magnitude(){
        return Math.sqrt(real*real + imag*imag);
    }

    public double argument(){
        return Math.atan(imag/real);
    }

    public MyComplex add(MyComplex right){
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right){
        return new MyComplex(real+right.real,imag+right.imag);
    }

    public MyComplex substract(MyComplex right){
        this.real -= right.real;
        this.imag -= right.imag;
        return this;
    }

    public MyComplex substractNew(MyComplex right){
        return new MyComplex(real-right.real,imag-right.imag);
    }

    public MyComplex multiply(MyComplex right){
        double tempReal = this.real;
        double tempImag = this.imag;
        this.real = (tempReal * right.real - tempImag * right.imag);
        this.imag = (tempReal * right.imag + tempImag * right.real);
        return this;
    }

    public MyComplex divide(MyComplex right) {
        double tempReal = this.real;
        double tempImag = this.imag;
        this.real = ((tempReal*right.real + tempImag*right.imag) /
                (Math.pow(right.real,2) + Math.pow(right.imag,2)));
        this.imag = ((right.real * tempImag - tempReal * right.imag) /
                (Math.pow(right.real,2) + Math.pow(right.imag,2)));
        return this;
    }

    public MyComplex conjugate(){
        return new MyComplex(real,-imag);
    }

}
