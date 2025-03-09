package com.mengyi.designpatterns.struct.facade;

public class DevPlayer {

    public void play(String movie){
        System.out.println("Dvd play " + movie);
    }

    public void turnOn(){
        System.out.println("Dvd turnOn");
    }

    public void turnOff(){
        System.out.println("Dvd turnOff");
    }
}
