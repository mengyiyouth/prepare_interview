package com.mengyi.designpatterns.behavor.interpreter;

public class NumberExpr implements Expr<Integer>{
    private int number;
    public NumberExpr(int number) {
        this.number = number;
    }
    @Override
    public Integer interpreter() {
        return this.number;
    }
}
