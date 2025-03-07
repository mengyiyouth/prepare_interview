package com.mengyi.designpatterns.build.factory.factorymethod;

public class CatFactory extends AbstractFactory{
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
