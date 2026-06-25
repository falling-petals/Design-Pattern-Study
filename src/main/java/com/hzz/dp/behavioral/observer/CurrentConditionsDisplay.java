package com.hzz.dp.behavioral.observer;

public class CurrentConditionsDisplay implements WeatherObserver {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("当前状况: " + temperature + "°C, " + humidity + "% 湿度");
    }
}
