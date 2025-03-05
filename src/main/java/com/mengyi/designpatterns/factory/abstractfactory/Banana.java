package com.mengyi.designpatterns.factory.abstractfactory;

public class Banana implements Fruit{
    @Override
    public void color() {
        System.out.println("Banana is yellow");
    }
}
