package com.mengyi.designpatterns.factory.abstractfactory;

public class Acer implements Computer{
    @Override
    public void brand(Fruit fruit) {
        System.out.println("I am Acer Computer");
        fruit.color();
    }
}
