package com.mengyi.designpatterns.adapt;

public class TestAdapt {
    public static void main(String[] args) {
        ModernVoltage modernVoltage = new EletronicAdapter(new OldVoltageInstance());
        modernVoltage.modernVoltage();
    }
}
