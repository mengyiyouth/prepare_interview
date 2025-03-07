package com.mengyi.designpatterns.adapt;

public class EletronicAdapter implements ModernVoltage{
    private OldVoltage oldVoltage;
    public EletronicAdapter(OldVoltage oldVoltage){
        this.oldVoltage = oldVoltage;
    }
    @Override
    public void modernVoltage() {
        oldVoltage.OldVoltage();
    }
}
