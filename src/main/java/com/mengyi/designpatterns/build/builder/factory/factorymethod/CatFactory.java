package com.mengyi.designpatterns.build.builder.factory.factorymethod;

public class CatFactory extends AbstractFactory{
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
