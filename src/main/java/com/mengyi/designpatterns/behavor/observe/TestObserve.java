package com.mengyi.designpatterns.behavor.observe;

public class TestObserve {
    public static void main(String[] args) {
        SimpleDisplay simpleDisplay = new SimpleDisplay();
        DetailDisplay detailDisplay = new DetailDisplay();
        WeatherStation weatherStation = new WeatherStation();
        weatherStation.register(simpleDisplay);
        weatherStation.register(detailDisplay);

        weatherStation.update(20);

    }
}
