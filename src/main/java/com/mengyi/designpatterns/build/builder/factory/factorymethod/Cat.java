package com.mengyi.designpatterns.build.builder.factory.factorymethod;

public class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println("Cat eat fish");
    }
}
