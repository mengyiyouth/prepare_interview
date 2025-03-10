package com.mengyi.designpatterns.behavor.mediator;

public interface ChatMediator {
    void sendMessage(String msg, User user);
    void addUser(User user);
}
