package com.hzz.dp.behavioral.mediator;

public interface ChatMediator {
    void sendMessage(String message, ChatUser user);
    void addUser(ChatUser user);
}
