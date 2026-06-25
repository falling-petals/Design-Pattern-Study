package com.hzz.dp.behavioral.strategy;

public class Order {
    private final String orderId;
    private final double amount;
    private PaymentStrategy strategy;

    public Order(String orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
    }

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void checkout() {
        System.out.println("订单 " + orderId + " 总计: " + amount + " 元");
        strategy.pay(amount);
    }
}
