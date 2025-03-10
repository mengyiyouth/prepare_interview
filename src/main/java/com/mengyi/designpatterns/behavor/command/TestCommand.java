package com.mengyi.designpatterns.behavor.command;

public class TestCommand {
    public static void main(String[] args) {
        Light light = new LightOperation();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(lightOnCommand);
        remoteControl.pressButton();
        remoteControl.undoButton();
    }
}
