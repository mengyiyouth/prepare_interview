package com.mengyi.designpatterns.behavor.bridge;

public class OperationAppliances {
    private Appliances appliances;
    public OperationAppliances(Appliances appliances){
        this.appliances = appliances;
    }
    public void setAppliances(Appliances appliances){
        this.appliances = appliances;
    }
    public void powerOn(){
        appliances.turnOn();
    }

    public void changeChannel(int channel){
        appliances.setChannel(channel);
    }
}
