package com.mengyi.designpatterns.factory.factorymethod;

public class CatFactory extends AbstractFactory{
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
