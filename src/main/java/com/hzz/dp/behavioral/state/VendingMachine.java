package com.hzz.dp.behavioral.state;

public class VendingMachine {
    private final State noCoinState;
    private final State hasCoinState;
    private final State soldState;
    private final State soldOutState;

    private State currentState;
    private int count;

    public VendingMachine(int count) {
        noCoinState = new NoCoinState(this);
        hasCoinState = new HasCoinState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);

        this.count = count;
        currentState = count > 0 ? noCoinState : soldOutState;
    }

    public void insertCoin() { currentState.insertCoin(); }
    public void ejectCoin() { currentState.ejectCoin(); }
    public void pressButton() {
        currentState.pressButton();
        currentState.dispense();
    }

    public void releaseProduct() {
        if (count > 0) {
            System.out.println("出一瓶饮料");
            count--;
        }
    }

    public void setState(State state) { this.currentState = state; }
    public State getNoCoinState() { return noCoinState; }
    public State getHasCoinState() { return hasCoinState; }
    public State getSoldState() { return soldState; }
    public State getSoldOutState() { return soldOutState; }
    public int getCount() { return count; }
}
