package com.mengyi.designpatterns.struct.decorator;

public class TestDecorator {
    public static void main(String[] args) {
        Coffee coffee = new BasicCoffee();
        System.out.println(coffee.getCoffeeName() + " " + coffee.getCoffeePrice());
        SugarCoffee sugarCoffee = new SugarCoffee(coffee);
        System.out.println(sugarCoffee.getCoffeeName() + " " + sugarCoffee.getCoffeePrice());
        MilkCoffee milkCoffee = new MilkCoffee(sugarCoffee);
        System.out.println(milkCoffee.getCoffeeName() + " " + milkCoffee.getCoffeePrice());
    }
}
