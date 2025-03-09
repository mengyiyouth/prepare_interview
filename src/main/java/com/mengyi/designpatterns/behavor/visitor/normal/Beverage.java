package com.mengyi.designpatterns.behavor.visitor.normal;

public class Beverage implements ShoppingCart{
    private String name;
    private double price;
    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public Beverage(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
