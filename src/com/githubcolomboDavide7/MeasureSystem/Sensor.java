package com.githubcolomboDavide7.MeasureSystem;

public abstract class Sensor {

    // Class variables
    private static int ID = 0;

    // Instance variables
    protected int sensorID;
    protected MeasureUnit defaultUnit;

    // Public Constructor
    public Sensor(MeasureUnit defaultUnit){
        this.sensorID = Sensor.ID++;
        this.defaultUnit = defaultUnit;
    }

    // Instance method that returns the sensorID value
    public int getSensorID(){
        return this.sensorID;
    }
    
    // Abstract method that returns a double value acquired by the SPECIFIC sensor
    public abstract double getSensorValue();

    @Override
    public String toString(){
        return  "Sensor ID: " + this.sensorID + "\n" +
                "Default unit: " + this.defaultUnit + "\n";
    }

}
