package com.hzz.dp.behavioral.strategy;

public class WechatStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.printf("微信支付: %.2f 元 (使用零钱)\n", amount);
    }
}
