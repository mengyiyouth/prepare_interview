package com.mengyi.designpatterns.build.builder.factory.abstractfactory;

public class Grape implements Fruit{
    @Override
    public void color() {
        System.out.println("Grape is purple");
    }
}
