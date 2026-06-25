package com.hzz.dp.behavioral.command;

import java.util.Stack;

public class RemoteControl {
    private Command currentCommand;
    private final Stack<Command> history = new Stack<>();

    public void pressButton(Command command) {
        command.execute();
        history.push(command);
        currentCommand = command;
    }

    public void pressUndo() {
        if (!history.isEmpty()) {
            Command last = history.pop();
            last.undo();
        } else {
            System.out.println("没有可撤销的操作");
        }
    }
}
