package com.mengyi.designpatterns.build.factory.abstractfactory;

public class Banana implements Fruit{
    @Override
    public void color() {
        System.out.println("Banana is yellow");
    }
}
