package com.mengyi.designpatterns.build.factory.abstractfactory;

public class HuaWeiFactory extends AbstractFactory {
    @Override
    public Computer createComputer() {
        return new HuaWei();
    }

    @Override
    public Fruit createFruit() {
        return new Banana();
    }
}
