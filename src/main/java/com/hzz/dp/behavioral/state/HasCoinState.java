package com.hzz.dp.behavioral.state;

public class HasCoinState implements State {
    private final VendingMachine machine;

    public HasCoinState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("已投币，无需重复投币");
    }

    @Override
    public void ejectCoin() {
        System.out.println("退币成功");
        machine.setState(machine.getNoCoinState());
    }

    @Override
    public void pressButton() {
        System.out.println("按下按钮，开始出货");
        machine.setState(machine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("请先按下按钮");
    }
}
