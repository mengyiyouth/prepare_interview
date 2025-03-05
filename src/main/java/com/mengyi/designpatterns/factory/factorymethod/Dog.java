package com.mengyi.designpatterns.factory.factorymethod;

public class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("Dog eat bone");
    }
}
