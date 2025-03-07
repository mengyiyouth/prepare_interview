package com.mengyi.designpatterns.build.builder.normal;

public class Person {
    private String name;
    private int age;
    private String address;
    private String phone;
    private String email;

    private Person(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
        this.phone = builder.phone;
        this.email = builder.email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class Builder{
        private String name;
        private int age;
        private String address;
        private String phone;
        private String email;

        private Builder(){}

        public static Builder builder(){
            return new Builder();
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }

        public Builder phone(String phone){
            this.phone = phone;
            return this;
        }

        public Builder email(String email){
            this.email = email;
            return this;
        }
        public Person build(){
            return new Person(this);
        }

    }
}
