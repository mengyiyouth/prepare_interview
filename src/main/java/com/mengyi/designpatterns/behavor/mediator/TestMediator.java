package com.mengyi.designpatterns.behavor.mediator;

public class TestMediator {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        ChatUser bob = new ChatUser(chatRoom, "Bob");
        ChatUser john = new ChatUser(chatRoom, "John");
        ChatUser jobs = new ChatUser(chatRoom, "Jobs");


        bob.send("Hello EveryOne");
    }
}
