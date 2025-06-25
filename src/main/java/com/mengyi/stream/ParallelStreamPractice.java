package com.mengyi.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamPractice {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("mengyi");
        list.add("wanglei");
        list.add("qianqian");
        list.parallelStream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        list.forEach(System.out::println);

        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("c", "d"),
                Arrays.asList("e")
        );

        List<String> result = nestedList.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}
