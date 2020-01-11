package com.notnetcracker.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private int id;

    @Column(name = "order_date")
    private String date;


    @Column(name = "order_seller")
    private int seller;

    @Column(name = "order_buyer")
    private int buyer;


    @Column(name = "order_book")
    private String book;

    @Column(name = "order_quantity")
    private int quantity;

    @Column(name = "order_amount")
    private float amount;

    public Order(String date, int seller, int buyer, String book, int quantity, float amount) {
        this.date = date;
        this.seller = seller;
        this.buyer = buyer;
        this.book = book;
        this.quantity = quantity;
        this.amount = amount;
    }
    public Order(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getSeller() {
        return seller;
    }

    public void setSeller(int seller) {
        this.seller = seller;
    }

    public int getBuyer() {
        return buyer;
    }

    public void setBuyer(int buyer) {
        this.buyer = buyer;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Order{" +
            "id=" + id +
            ", date='" + date + '\'' +
            ", seller=" + seller +
            ", buyer=" + buyer +
            ", book='" + book + '\'' +
            ", quantity=" + quantity +
            ", amount=" + amount +
            '}';
    }
}
