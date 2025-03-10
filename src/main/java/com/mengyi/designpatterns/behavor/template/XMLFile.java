package com.mengyi.designpatterns.behavor.template;

public class XMLFile extends ProcessFile{
    @Override
    public void openFile() {
        System.out.println("Open XML File");
    }

    @Override
    public void readFile() {
        System.out.println("Read XML File");
    }

    @Override
    public void closeFile() {
        System.out.println("Close XML File");
    }
}
