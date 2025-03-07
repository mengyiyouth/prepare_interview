package com.mengyi.designpatterns.behavor.decorator;

public abstract class CoffeeDecorator implements Coffee{
    private Coffee coffee;
    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double getCoffeePrice() {
        return coffee.getCoffeePrice();
    }

    @Override
    public String getCoffeeName() {
        return coffee.getCoffeeName();
    }
}
