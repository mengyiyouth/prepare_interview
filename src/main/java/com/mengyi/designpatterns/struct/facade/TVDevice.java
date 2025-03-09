package com.mengyi.designpatterns.struct.facade;

public class TVDevice {

    public void turnOn(){
        System.out.println("TV turn on");
    }

    public void setInput(String input){
        System.out.println("TV set input: "+input);
    }

    public void turnOff(){
        System.out.println("TV turn off");
    }
}
