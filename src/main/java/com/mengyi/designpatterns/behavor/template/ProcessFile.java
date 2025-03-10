package com.mengyi.designpatterns.behavor.template;

public abstract class ProcessFile {
    public final void process(){
        openFile();
        readFile();
        closeFile();
    }
    public abstract void openFile();
    public abstract void readFile();
    public abstract void closeFile();
}
