package com.mengyi.designpatterns.behavor.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {
    private static final Map<String, Shape> shapeMap = new HashMap<>();
    public Shape getCircle(String color){
        if(shapeMap.get(color) != null){
            return shapeMap.get(color);
        }
        Circle circle = new Circle(color);
        shapeMap.put(color, circle);
        return circle;
    }
}
