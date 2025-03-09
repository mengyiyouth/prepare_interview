package com.mengyi.designpatterns.behavor.interpreter;

public class AddInterpreter implements Expr<Integer>{
    private NumberExpr leftExpr;
    private NumberExpr rightExpr;

    public AddInterpreter(NumberExpr leftExpr, NumberExpr rightExpr) {
        this.leftExpr = leftExpr;
        this.rightExpr = rightExpr;
    }

    public Integer interpreter() {
        return leftExpr.interpreter() + rightExpr.interpreter();
    }
}
