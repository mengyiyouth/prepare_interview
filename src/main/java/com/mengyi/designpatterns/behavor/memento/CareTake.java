package com.mengyi.designpatterns.behavor.memento;

public class CareTake {
    private Memento memento;

    public void setMemento(Memento memento){
        this.memento = memento;
    }

    public Memento getMemento(){
        return memento;
    }
}
