package com.mengyi.designpatterns.behavor.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator{
    private final List<User> list;

    public ChatRoom(){
        this.list = new ArrayList<>();
    }
    @Override
    public void sendMessage(String msg, User user) {
        for (User user1 : list) {
            if(!user1.equals(user)){
                user1.receive(msg);
            }
        }
    }

    @Override
    public void addUser(User user) {
        this.list.add(user);
    }
}
