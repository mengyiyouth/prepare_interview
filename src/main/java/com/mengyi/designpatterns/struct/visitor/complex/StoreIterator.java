package com.mengyi.designpatterns.struct.visitor.complex;

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
