package com.mengyi.designpatterns.behavor.memento;

public class Original {
    private int state;
    public void setState(int state){
        this.state = state;
        System.out.println("state = " + state);
    }

    public int getState(){
        return this.state;
    }

    public Memento createMemento(){
        System.out.println("createMemento");
        return new Memento(this.state);
    }

    public void restoreMemento(Memento memento){
        System.out.println("restor state = " + memento.getState());
        this.state = memento.getState();
    }
}
