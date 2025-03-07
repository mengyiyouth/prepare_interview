package com.mengyi.designpatterns.struct.visitor.normal;

public interface Visitor {
    double visit(Book book);
    double visit(Beverage beverage);
}
