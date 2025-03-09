package com.mengyi.designpatterns.behavor.interpreter;

public class TestInterpreter {
    public static void main(String[] args) {
        NumberExpr leftExpr = new NumberExpr(10);
        NumberExpr rightExpr = new NumberExpr(20);
        AddInterpreter addInterpreter = new AddInterpreter(leftExpr,rightExpr);
        System.out.println(addInterpreter.interpreter());
    }
}
