package com.githubcolomboDavide7.MeasureSystem;

public class Sensor {

// =======================================================================================
    public static Sensor PM10Sensor(MeasureUnit unit, int from, int to){
        return new Sensor(unit, from, to);
    }

    public static Sensor TempSensor(MeasureUnit unit, int from, int to){
        return new Sensor(unit, from, to);
    }

// =======================================================================================
    private static int ID = 0;

    protected int sensorID;
    protected MeasureUnit defaultUnit;
    private int from;
    private int to;

    private Sensor(MeasureUnit defaultUnit, int from, int to){
        this.sensorID = Sensor.ID++;
        this.defaultUnit = defaultUnit;
        this.from = from;
        this.to = to;
    }

    public double getValue(){
        return from + (to - from)*Math.random();
    }

    @Override
    public String toString(){
        return  "Sensor ID: " + this.sensorID + "\n" +
                "Default unit: " + this.defaultUnit + "\n" +
                "Range goes from: " + this.from + " to " + this.to + "\n";
    }

}
