package com.mengyi.designpatterns.struct.visitor.complex;

public interface Visitor {
    void visit(FileLevel fileLevel);
    void visit(DirectoryLevel directoryLevel);
}
