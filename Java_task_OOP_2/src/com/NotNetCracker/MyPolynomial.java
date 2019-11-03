package com.NotNetCracker;

import java.util.Arrays;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs){
        this.coeffs = coeffs;
    }

    public int getDegree(){
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        String temp = "" + coeffs[0] ;
        for (int i = 1; i < coeffs.length ; i++) {
            temp +=  " + " +  coeffs[i] + "x^" + i ;
        }
        return temp;
    }

    public  double evaluate(double x){
        double result = coeffs[0];
         for(int i = 1; i < coeffs.length; i++){
            result += (coeffs[i] * Math.pow(x,i));
          }
        return result;
    }

    public MyPolynomial add(MyPolynomial right){
        if(coeffs.length >= right.coeffs.length){
            double[] result = new double[coeffs.length];
            for (int i = 0; i < right.coeffs.length ; i++) {
            result[i] = coeffs[i] + right.coeffs[i];
            }
            for(int i = right.coeffs.length; i < coeffs.length; i++){
                result[i] = coeffs[i];
            }
            return new MyPolynomial(result);
        }
        else {
            double[] result = new double[right.coeffs.length];
            for (int i = 0; i < coeffs.length ; i++) {
                result[i] = coeffs[i] + right.coeffs[i];
            }
            for(int i = coeffs.length; i < right.coeffs.length; i++){
                result[i] = right.coeffs[i];
            }
            return new MyPolynomial(result);
        }
    }

    public MyPolynomial multiply(MyPolynomial right){
            int resultLength = coeffs.length + right.coeffs.length -1;
            if(coeffs.length >= right.coeffs.length){
               double[] result = new double[resultLength];
               for(int i = 0; i < coeffs.length; i++){
                    for (int j = 0; j < right.coeffs.length; j++){
                     result[i+j] += coeffs[i] * right.coeffs[j];
                     }
                }
               return new MyPolynomial(result);
            }
            else {
                double[] result = new double[resultLength];
                for(int i = 0; i < right.coeffs.length; i++){
                    for (int j = 0; j < coeffs.length; j++){
                        result[i+j] += coeffs[j] * right.coeffs[i];
                    }
                }
                return new MyPolynomial(result);
            }
        }

}

