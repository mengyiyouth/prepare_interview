package com.mengyi.multiple;

public class ReflectionCommandProcessor {

    private final String name = "command";
    public String getName(){
        return name;
    }

    private void add(String data){
        System.out.println("add: " + data );
    }

    private void delete(String data){
        System.out.println("delete: " + data );
    }

    private void update(String data){
        System.out.println("update: " + data );
    }

    private void query(String data){
        System.out.println("query: " + data );
    }


}