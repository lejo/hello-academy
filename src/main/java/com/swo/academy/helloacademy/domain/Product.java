package com.swo.academy.helloacademy.domain;

public class Product {

    private String title = "Default Title";
    private String description;
    private double price;

    public Product() {
    }

    public Product(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public String getTitle() {
        return this.title;
    }
}
