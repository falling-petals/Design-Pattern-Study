package com.hzz.dp.behavioral.observer;

public class ObserverDemo {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay current = new CurrentConditionsDisplay();
        StatisticsDisplay stats = new StatisticsDisplay();

        weatherData.registerObserver(current);
        weatherData.registerObserver(stats);

        System.out.println("第一次测量:");
        weatherData.setMeasurements(26.5f, 65, 1013.1f);

        System.out.println();
        System.out.println("第二次测量:");
        weatherData.setMeasurements(28.0f, 70, 1012.0f);

        System.out.println();
        System.out.println("第三次测量 (移除当前状况面板):");
        weatherData.removeObserver(current);
        weatherData.setMeasurements(24.3f, 80, 1014.5f);
    }
}
