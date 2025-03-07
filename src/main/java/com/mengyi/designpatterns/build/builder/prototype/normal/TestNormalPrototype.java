package com.mengyi.designpatterns.build.builder.prototype.normal;

import java.util.ArrayList;
import java.util.List;

public class TestNormalPrototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        List<String> list = new ArrayList<>();
        list.add("bedroom");
        list.add("bathroom");
        list.add("kitchen");
        House house = new House("Shanghai", 100, 5, list);

        System.out.println(house.getRoom());
        House clone = house.clone();
        house.addRoom("beadroom2");
        System.out.println(clone.getRoom());


    }

}
