package com.mengyi.designpatterns.build.builder.factory.abstractfactory;

public class TestAbstractFactory {
    public static void main(String[] args) {
        HuaWeiFactory huaWeiFactory = new HuaWeiFactory();
        Computer computer = huaWeiFactory.createComputer();
        Fruit fruit = huaWeiFactory.createFruit();
        computer.brand(fruit);

        AcerFactory acerFactory = new AcerFactory();
        computer = acerFactory.createComputer();
        fruit = acerFactory.createFruit();
        computer.brand(fruit);


    }
}
