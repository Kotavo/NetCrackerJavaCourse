package com.NotNetcraker.AdditionalTask.Person;

import java.util.Objects;

public class Person {
    private String name;
    private String adress;

    public Person(String name, String adress){
        this.name = name;
        this.adress = adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    @Override
    public String toString() {
        return "Person [" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return name.equals(person.name) &&
                adress.equals(person.adress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, adress);
    }
}
