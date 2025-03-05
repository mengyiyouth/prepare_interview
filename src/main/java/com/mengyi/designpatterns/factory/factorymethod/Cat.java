package com.mengyi.designpatterns.factory.factorymethod;

public class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println("Cat eat fish");
    }
}
