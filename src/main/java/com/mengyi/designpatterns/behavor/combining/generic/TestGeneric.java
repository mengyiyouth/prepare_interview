package com.mengyi.designpatterns.behavor.combining.generic;

import java.util.function.Function;

public class TestGeneric {
    public static void main(String[] args) {
        Function<Integer, Integer> addFunction = x -> x + 1;
        GenericExample<Integer, Integer> integerIntegerGenericExample = GenericExample.of(addFunction);
        System.out.println(integerIntegerGenericExample.apply(3));
        Function<Integer, String> stringFunction = x -> x + "123";
        GenericExample<Integer, String> add = integerIntegerGenericExample.add(stringFunction);
        System.out.println(add.apply(2));
        Function<String, Double> doubleFunction = x -> Double.parseDouble(x);
        GenericExample<Integer, Double> add1 = add.add(doubleFunction);
        System.out.println(add1.apply(2));



    }
}
