package com.mengyi.designpatterns.behavor.combining.generic;

import java.util.function.Function;

public class GenericExample <T, R>{
    private final Function<T, R> function;
    public GenericExample(Function<T, R> function){
        this.function = function;
    }

    public static <T, R> GenericExample<T, R> of(Function<T, R> function){
        return new GenericExample<T, R>(function);
    }

    public <V> GenericExample<T, V> add(Function<R, V> other){
        return new GenericExample<T, V>(function.andThen(other));
    }

    public R apply(T t){
        return function.apply(t);
    }

}
