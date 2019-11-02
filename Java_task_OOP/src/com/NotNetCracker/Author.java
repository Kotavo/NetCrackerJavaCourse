package com.NotNetCracker;

public class Author {
    private String name;
    private String emal;
    private char gender = 'm';

    public Author(String name, String emal, char gender) {
        this.name = name;
        this.emal = emal;
        this.gender = gender;
    }

    public Author(String name, String emal) {
        this.name = name;
        this.emal = emal;
    }

    public String getName() {
        return name;
    }

    public String getEmal() {
        return emal;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmal(String emal) {
        this.emal = emal;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", emal='" + emal + '\'' +
                ", gender=" + gender +
                '}';
    }
}
