package com.mengyi.designpatterns.behavor.template;

public class TestTemplate {
    public static void main(String[] args) {
        ProcessFile processFile = new CSVFile();
        processFile.process();

        processFile = new XMLFile();
        processFile.process();
    }
}
