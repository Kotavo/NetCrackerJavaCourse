package com.notnetcracker.model;

import org.springframework.stereotype.Component;

@Component
public class Person {
    private String id;
    private String firstName;
    private String secondName;
    private String salary;
    private String mail;
    private String workPlace;

    public Person(String id, String firstName, String secondName, String salary, String mail, String workPlace) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.salary = salary;
        this.mail = mail;
        this.workPlace = workPlace;
    }

    @Override
    public String toString() {
        return "Person{" +
            "id=" + id +
            ", firstName='" + firstName + '\'' +
            ", secondName='" + secondName + '\'' +
            ", salary='" + salary + '\'' +
            ", mail='" + mail + '\'' +
            ", workPlace='" + workPlace + '\'' +
            '}';
    }

    public Person() {
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getSalary() {
        return salary;
    }

    public String getMail() {
        return mail;
    }

    public String getWorkPlace() {
        return workPlace;
    }
}
