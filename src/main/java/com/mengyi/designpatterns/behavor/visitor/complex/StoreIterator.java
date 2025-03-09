package com.mengyi.designpatterns.behavor.visitor.complex;

public class StoreIterator implements Visitor{
    @Override
    public void visit(FileLevel fileLevel) {
        System.out.println(fileLevel.getName());
    }

    @Override
    public void visit(DirectoryLevel directoryLevel) {
        //directory do nothing
    }
}
