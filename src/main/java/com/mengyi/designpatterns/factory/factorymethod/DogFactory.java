package com.mengyi.designpatterns.factory.factorymethod;

public class DogFactory extends AbstractFactory{
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
