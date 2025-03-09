package com.mengyi.designpatterns.struct.bridge;

public class Radio implements Appliances{
    @Override
    public void turnOn() {
        System.out.println("Radio turn on");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Radio set channel " + channel);
    }
}
