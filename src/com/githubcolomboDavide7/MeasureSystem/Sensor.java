package com.githubcolomboDavide7.MeasureSystem;

public class Sensor {

// =======================================================================================
    public static Sensor PM10Sensor(MeasureUnit unit, int from, int to){
        return new Sensor(null, unit, from, to);
    }

    public static Sensor TempSensor(MeasureUnit unit, int from, int to){
        return new Sensor(new TemperatureConverter(), unit, from, to);
    }

// =======================================================================================
    private static int ID = 0;

    private int sensorID;
    private MeasureUnit defaultUnit;
    private IConverter converter;
    private int from;
    private int to;

    private Sensor(IConverter converter, MeasureUnit defaultUnit, int from, int to){
        this.sensorID = Sensor.ID++;
        this.defaultUnit = defaultUnit;
        this.converter = converter;
        this.from = from;
        this.to = to;
    }

    public double getValue(){
        return from + (to - from)*Math.random();
    }

    public void changeUnit(MeasureUnit newUnit){
        if(converter == null)
            return;

        try {
            this.from = (int) this.converter.convertValue(this.defaultUnit, newUnit, this.from);
            this.to = (int) this.converter.convertValue(this.defaultUnit, newUnit, this.to);
            this.defaultUnit = newUnit;
        } catch(ConversionException e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public String toString(){
        return  "Sensor ID: " + this.sensorID + "\n" +
                "Default unit: " + this.defaultUnit + "\n" +
                "Range goes from: " + this.from + " to " + this.to + "\n";
    }

}
