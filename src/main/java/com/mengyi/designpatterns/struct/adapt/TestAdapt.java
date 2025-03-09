package com.mengyi.designpatterns.struct.adapt;

public class TestAdapt {
    public static void main(String[] args) {
        ModernVoltage modernVoltage = new EletronicAdapter(new OldVoltageInstance());
        modernVoltage.modernVoltage();
    }
}
