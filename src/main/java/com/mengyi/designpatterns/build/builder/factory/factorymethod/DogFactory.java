package com.mengyi.designpatterns.build.builder.factory.factorymethod;

public class DogFactory extends AbstractFactory{
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
