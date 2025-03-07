package com.mengyi.designpatterns.build.builder.factory.abstractfactory;

public class Acer implements Computer{
    @Override
    public void brand(Fruit fruit) {
        System.out.println("I am Acer Computer");
        fruit.color();
    }
}
