package com.mengyi.designpatterns.build.factory.abstractfactory;

public class HuaWei implements Computer{
    @Override
    public void brand(Fruit fruit) {
        System.out.println("I am HuaWei Computer");
        fruit.color();
    }

}
