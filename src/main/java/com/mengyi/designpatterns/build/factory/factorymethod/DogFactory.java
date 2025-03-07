package com.mengyi.designpatterns.build.factory.factorymethod;

public class DogFactory extends AbstractFactory{
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
