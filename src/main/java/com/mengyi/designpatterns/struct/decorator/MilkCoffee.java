package com.mengyi.designpatterns.struct.decorator;

public class MilkCoffee extends CoffeeDecorator{
    public MilkCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCoffeePrice() {
        return super.getCoffeePrice() + 10;
    }

    @Override
    public String getCoffeeName() {
        return super.getCoffeeName() + " with milk";
    }
}
