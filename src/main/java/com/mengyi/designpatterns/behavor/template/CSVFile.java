package com.mengyi.designpatterns.behavor.template;

public class CSVFile extends ProcessFile{
    @Override
    public void openFile() {
        System.out.println("Open CSV File");
    }

    @Override
    public void readFile() {
        System.out.println("Read CSV File");
    }

    @Override
    public void closeFile() {
        System.out.println("Close CSV File");
    }
}
