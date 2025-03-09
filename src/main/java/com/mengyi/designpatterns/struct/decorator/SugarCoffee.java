package com.mengyi.designpatterns.struct.decorator;

public class SugarCoffee extends CoffeeDecorator{
    public SugarCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCoffeePrice(){
        return super.getCoffeePrice() + 5;
    }

    @Override
    public String getCoffeeName() {
        return super.getCoffeeName() + " with sugar";
    }

}
