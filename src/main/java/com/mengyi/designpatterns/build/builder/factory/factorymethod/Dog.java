package com.mengyi.designpatterns.build.builder.factory.factorymethod;

public class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("Dog eat bone");
    }
}
