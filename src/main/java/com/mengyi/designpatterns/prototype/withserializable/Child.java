package com.mengyi.designpatterns.prototype.withserializable;

import java.io.*;
import java.util.List;

public class Child implements Serializable {
    public static final long serialVersionUID = 1L;

    private String name;
    private int age;
    private double height;
    private List<String> hobbies;

    public Child(String name, int age, double height, List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.hobbies = hobbies;
    }

    @Override
    public Child clone(){
        try{
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);

            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            return (Child) objectInputStream.readObject();
        }catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public void addHobby(String hobby){
        this.hobbies.add(hobby);
    }
}
