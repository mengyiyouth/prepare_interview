package com.mengyi.designpatterns.struct.bridge;

public class TV implements Appliances{
    @Override
    public void turnOn() {
        System.out.println("TV is on");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("TV set to channel " + channel);
    }
}
