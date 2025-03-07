package com.mengyi.designpatterns.build.prototype.withserializable;

import java.util.ArrayList;
import java.util.List;

public class TestChildPrototype {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("run");
        list.add("swim");
        Child child = new Child("mengyi", 18, 1.75, list);


        Child clone = child.clone();
        clone.addHobby("play");
        System.out.println(child.getHobbies());

    }
}
