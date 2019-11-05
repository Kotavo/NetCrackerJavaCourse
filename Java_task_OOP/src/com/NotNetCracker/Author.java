package com.NotNetCracker;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author author = (Author) o;
        return gender == author.gender &&
                name.equals(author.name) &&
                emal.equals(author.emal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, emal, gender);
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
