package com.githubcolomboDavide7.MeasureSystem;

public abstract class Sensor {

    // Class variables
    private static int ID = 0;

    // Instance variables
    private int sensorID;

    // Public Constructor
    public Sensor(){
        this.sensorID = Sensor.ID++;
    }

    // Abstract method that returns a double value acquired by the SPECIFIC sensor
    public abstract double getSensorValue();

    // Instance method that returns the sensorID value
    public int getSensorID(){
        return this.sensorID;
    }

}
