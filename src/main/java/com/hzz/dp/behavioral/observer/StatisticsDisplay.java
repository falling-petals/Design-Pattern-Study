package com.hzz.dp.behavioral.observer;

public class StatisticsDisplay implements WeatherObserver {
    private float maxTemp = Float.MIN_VALUE;
    private float minTemp = Float.MAX_VALUE;
    private float sumTemp;
    private int numReadings;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        sumTemp += temperature;
        numReadings++;
        if (temperature > maxTemp) {
            maxTemp = temperature;
        }
        if (temperature < minTemp) {
            minTemp = temperature;
        }
        System.out.println("温度统计: 平均 " + String.format("%.1f", sumTemp / numReadings)
                + "°C / 最高 " + maxTemp + "°C / 最低 " + minTemp + "°C");
    }
}
