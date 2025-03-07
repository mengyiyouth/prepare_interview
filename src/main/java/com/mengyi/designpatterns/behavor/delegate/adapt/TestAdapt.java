package com.mengyi.designpatterns.behavor.delegate.adapt;

public class TestAdapt {
    public static void main(String[] args) {
        ModernVoltage modernVoltage = new EletronicAdapter(new OldVoltageInstance());
        modernVoltage.modernVoltage();
    }
}
