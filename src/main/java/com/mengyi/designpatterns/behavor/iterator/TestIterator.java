package com.mengyi.designpatterns.behavor.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Orange");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
