package com.mengyi.designpatterns.build.factory.abstractfactory;

public class AcerFactory extends AbstractFactory{
    @Override
    public Computer createComputer() {
        return new Acer();
    }

    @Override
    public Fruit createFruit() {
        return new Grape();
    }
}
