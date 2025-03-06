package com.mengyi.designpatterns.prototype.normal;

import java.util.ArrayList;
import java.util.List;

public class House implements Cloneable {
    private String address;
    private double area;
    private int floor;
    private List<String> room;

    @Override
    public House clone() throws CloneNotSupportedException {
        House house = (House)super.clone();
        house.room = new ArrayList<>(this.room);
        return house;
    }

    public House(String address, double area, int floor, List<String> room) {
        this.address = address;
        this.area = area;
        this.floor = floor;
        this.room = room;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public List<String> getRoom() {
        return room;
    }

    public void addRoom(String room) {
        this.room.add(room);
    }

    public void setRoom(List<String> room) {
        this.room = room;
    }
}
