package com.githubcolomboDavide7.MeasureSystem;

public class Sensor {

// =======================================================================================
    public static Sensor PM10Sensor(int from, int to){
        return new Sensor(from, to);
    }

    public static Sensor TempSensor(int from, int to) {
        return new Sensor(from, to);
    }

// =======================================================================================
    private static int ID = 0;

    private int sensorID;
    private int from;
    private int to;

    private Sensor( int from, int to){
        this.sensorID = Sensor.ID++;
        this.from = from;
        this.to = to;
    }

    protected double getValue(){
        return from + (to - from)*Math.random();
    }

    protected void changeUnit(IConverter converter, MeasureUnit oldUnit, MeasureUnit newUnit) throws ConversionException {
        this.from = (int) converter.convertValue(oldUnit, newUnit, this.from);
        this.to = (int) converter.convertValue(oldUnit, newUnit, this.to);
    }

    @Override
    public String toString(){
        return  "Sensor ID: " + this.sensorID + "\n" +
                "Range goes from: " + this.from + " to " + this.to + "\n";
    }

}
