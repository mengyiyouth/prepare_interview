package com.mengyi.designpatterns.behavor.memento;

public class TestMemento {
    public static void main(String[] args) {
        Original original = new Original();
        original.setState(1);
        CareTake careTake = new CareTake();
        careTake.setMemento(original.createMemento());
        original.setState(2);
        original.setState(3);

        original.restoreMemento(careTake.getMemento());


    }
}
