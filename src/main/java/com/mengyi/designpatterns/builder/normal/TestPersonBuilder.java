package com.mengyi.designpatterns.builder.normal;

public class TestPersonBuilder {
    public static void main(String[] args) {
        Person person = Person.Builder.builder()
                .name("John")
                .age(18)
                .address("China")
                .phone("123456789")
                .email("123@qq.com")
                .build();
        System.out.println(person);

    }
}
