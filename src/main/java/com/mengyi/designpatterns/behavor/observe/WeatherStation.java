package com.mengyi.designpatterns.behavor.observe;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Station {
    private List<Observe> list;
    private double temperature;

    public WeatherStation(){
        this.list = new ArrayList<>();
    }

    @Override
    public void register(Observe observe) {
        this.list.add(observe);
    }

    @Override
    public void unregister(Observe observe) {
        this.list.remove(observe);
    }

    @Override
    public void update(double temperature) {
        this.temperature = temperature;
        notifyObserve();
    }

    private void notifyObserve(){
        for (Observe observe : list) {
            observe.update(this.temperature);
        }
    }

}
