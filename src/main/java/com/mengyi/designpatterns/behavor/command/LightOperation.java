package com.mengyi.designpatterns.behavor.command;

public class LightOperation implements Light {


    @Override
    public void turnOn(){
        System.out.println("light turn on");
    }

    @Override
    public void turnOff(){
        System.out.println("light turn off");
    }
}
