package com.mengyi.designpatterns.struct.combining.simple;

import java.util.function.BiFunction;
import java.util.function.Function;

public class SimpleCombining {

    private Function<Integer, Integer> addFunction = x -> x + 1;
    private Function<Integer, Integer> multiplyFunction = x -> x * 2;
    private Function<Integer, Integer> composeFunction = addFunction.andThen(multiplyFunction);

    private BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a + b;
    private BiFunction<Integer, Integer, Integer> bi = biFunction.andThen(multiplyFunction);
    public static void main(String[] args) {
        SimpleCombining simpleCombining = new SimpleCombining();
        System.out.println(simpleCombining.composeFunction.apply(5));

        System.out.println(simpleCombining.bi.apply(3, 4));
    }
}
