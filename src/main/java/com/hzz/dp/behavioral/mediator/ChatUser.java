package com.hzz.dp.behavioral.mediator;

public class ChatUser {
    private final String name;
    private final ChatMediator mediator;

    public ChatUser(String name, ChatMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public void send(String message) {
        System.out.println(name + " 发送: " + message);
        mediator.sendMessage(message, this);
    }

    public void receive(String message, String fromName) {
        System.out.println("  → " + name + " 收到 " + fromName + " 的消息: " + message);
    }

    public String getName() {
        return name;
    }
}
