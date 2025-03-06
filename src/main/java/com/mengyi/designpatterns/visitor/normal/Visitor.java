package com.mengyi.designpatterns.visitor.normal;

public interface Visitor {
    double visit(Book book);
    double visit(Beverage beverage);
}
