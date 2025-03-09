package com.mengyi.designpatterns.struct.facade;

public class Amplifier {
    public void turnOn()
    {
        System.out.println("Amplifier turn on");
    }

    public void volumn(String num){
        System.out.println("set volumn " + num);
    }

    public void turnOff(){
        System.out.println("Amplifier turn off");
    }

}
