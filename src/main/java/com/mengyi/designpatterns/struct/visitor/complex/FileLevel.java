package com.mengyi.designpatterns.struct.visitor.complex;

public class FileLevel implements Store{
    private String name;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public FileLevel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
