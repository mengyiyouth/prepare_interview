package com.mengyi.designpatterns.behavor.decorator;

public class BasicCoffee implements Coffee{
    @Override
    public double getCoffeePrice() {
        return 5.0;
    }

    @Override
    public String getCoffeeName() {
        return "Basic Coffee";
    }
}
