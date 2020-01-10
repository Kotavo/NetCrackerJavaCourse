package com.notnetcracker.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "store")
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "store_id")
    private int id;

    @Column(name = "store_name")
    private String name;

    @Column(name = "store_district")
    private String district;

    @Column(name = "store_commission")
    private float commission;

    public Store(String name, String district, float commission) {
        this.name = name;
        this.district = district;
        this.commission = commission;
    }

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

    public float getCommission() {
        return commission;
    }

    public void setCommission(float commission) {
        this.commission = commission;
    }

    @Override
    public String toString() {
        return "Store{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", district='" + district + '\'' +
            ", commission=" + commission +
            '}';
    }
}
