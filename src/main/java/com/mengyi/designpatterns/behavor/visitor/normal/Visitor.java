package com.mengyi.designpatterns.behavor.visitor.normal;

public interface Visitor {
    double visit(Book book);
    double visit(Beverage beverage);
}
