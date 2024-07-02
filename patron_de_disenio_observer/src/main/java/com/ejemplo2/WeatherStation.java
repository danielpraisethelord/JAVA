package com.ejemplo2;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        weatherData.addObserver(currentDisplay);

        weatherData.setMeasurements(80, 65);
        weatherData.setMeasurements(82, 70);
    }
}

