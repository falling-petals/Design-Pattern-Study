package com.hzz.dp.behavioral.mediator;

public class MediatorDemo {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        ChatUser alice = new ChatUser("Alice", chatRoom);
        ChatUser bob = new ChatUser("Bob", chatRoom);
        ChatUser charlie = new ChatUser("Charlie", chatRoom);

        chatRoom.addUser(alice);
        chatRoom.addUser(bob);
        chatRoom.addUser(charlie);

        System.out.println("=== Alice 发消息 ===");
        alice.send("大家好，今天天气不错");

        System.out.println();
        System.out.println("=== Bob 回复 ===");
        bob.send("是啊，适合出去走走");

        System.out.println();
        System.out.println("=== Charlie 发消息 ===");
        charlie.send("要不要一起去公园？");
    }
}
