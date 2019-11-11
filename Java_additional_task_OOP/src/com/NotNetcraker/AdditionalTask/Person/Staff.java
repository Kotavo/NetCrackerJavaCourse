package com.NotNetcraker.AdditionalTask.Person;

import java.util.Objects;

public class Staff extends Person {
    private String school;
    private double pay;

    public Staff(String name, String adress, String school, double pay) {
        super(name, adress);
        this.school = school;
        this.pay = pay;
    }
    public String getSchool(){
        return school;
    }
    private void setSchool(String school){
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff{" +
                super.toString() +
                ", school='" + school + '\'' +
                ", pay=" + pay +
                "} " ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Staff)) return false;
        if (!super.equals(o)) return false;
        Staff staff = (Staff) o;
        return Double.compare(staff.pay, pay) == 0 &&
                Objects.equals(school, staff.school);

    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), school, pay);
    }
}
