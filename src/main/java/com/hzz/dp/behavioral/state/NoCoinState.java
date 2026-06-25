package com.hzz.dp.behavioral.state;

public class NoCoinState implements State {
    private final VendingMachine machine;

    public NoCoinState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("投币成功");
        machine.setState(machine.getHasCoinState());
    }

    @Override
    public void ejectCoin() {
        System.out.println("没有硬币可退");
    }

    @Override
    public void pressButton() {
        System.out.println("请先投币");
    }

    @Override
    public void dispense() {
        System.out.println("请先投币");
    }
}
