package com.mengyi.designpatterns.behavor.visitor.complex;

public interface Visitor {
    void visit(FileLevel fileLevel);
    void visit(DirectoryLevel directoryLevel);
}
