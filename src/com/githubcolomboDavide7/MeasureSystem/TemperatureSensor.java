package com.githubcolomboDavide7.MeasureSystem;

public class TemperatureSensor extends Sensor {

    public TemperatureSensor(MeasureUnit defaultUnit) {
        super(defaultUnit);
    }

    // Return a value between 0 and 15 Celsius (default unit)
    @Override
    public double getSensorValue() {
        return 0 + 15*Math.random();
    }

}
