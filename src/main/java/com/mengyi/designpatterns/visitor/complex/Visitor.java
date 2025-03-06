package com.mengyi.designpatterns.visitor.complex;

public interface Visitor {
    void visit(FileLevel fileLevel);
    void visit(DirectoryLevel directoryLevel);
}
