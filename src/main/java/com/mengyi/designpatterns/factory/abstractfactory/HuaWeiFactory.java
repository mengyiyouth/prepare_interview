package com.mengyi.designpatterns.factory.abstractfactory;

import com.mengyi.designpatterns.factory.abstractfactory.AbstractFactory;

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
