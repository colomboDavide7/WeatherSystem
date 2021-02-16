package com.githubcolomboDavide7.MeasureSystem;

public class TemperatureSensor extends Sensor {

    // Return a value between 0 and 15 in Celsius
    @Override
    public double getSensorValue() {
        return  0 + 15*Math.random();
    }

}
