package com.notnetcracker.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "buyers")
public class Buyer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "buyer_id")
    private int id;

    @Column(name = "buyer_name")
    private String name;

    @Column(name = "buyer_district")
    private String district;

    @Column(name = "buyer_discount")
    private float discount;

    public Buyer(String name, String district, float discount) {
        this.name = name;
        this.district = district;
        this.discount = discount;
    }

    public Buyer(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }


    @Override
    public String toString() {
        return "Buyers{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", district='" + district + '\'' +
            ", discount=" + discount +
            '}';
    }
}
