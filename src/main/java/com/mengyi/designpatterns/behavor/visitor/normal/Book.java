package com.mengyi.designpatterns.behavor.visitor.normal;

public class Book implements ShoppingCart{

    private double price;
    private String name;
    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public Book(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
