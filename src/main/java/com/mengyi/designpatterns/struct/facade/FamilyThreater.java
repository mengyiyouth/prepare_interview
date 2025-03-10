package com.mengyi.designpatterns.struct.facade;

public class FamilyThreater {
    private TVDevice tvDevice = new TVDevice();
    private DevPlayer devPlayer = new DevPlayer();
    private Amplifier volumn = new Amplifier();

    public void playMovie(String movieName)
    {
        devPlayer.play(movieName);
        volumn.volumn("10");
        tvDevice.setInput("HDMI");


        devPlayer.turnOn();
        volumn.turnOn();
        tvDevice.turnOn();
    }

    public void stopMovie()
    {
        devPlayer.turnOff();
        volumn.turnOff();
        tvDevice.turnOff();
    }
}
