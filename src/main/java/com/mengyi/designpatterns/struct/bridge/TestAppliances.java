package com.mengyi.designpatterns.struct.bridge;

public class TestAppliances {
    public static void main(String[] args) {
        OperationAppliances operationAppliances = new OperationAppliances(new TV());
        operationAppliances.powerOn();
        operationAppliances.changeChannel(1);

        operationAppliances.setAppliances(new Radio());
        operationAppliances.powerOn();
        operationAppliances.changeChannel(2);
    }
}
