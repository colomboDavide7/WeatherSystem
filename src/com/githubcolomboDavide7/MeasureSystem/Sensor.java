package com.githubcolomboDavide7.MeasureSystem;

public class Sensor {

// =======================================================================================
    public static Sensor PM10Sensor(MeasureUnit unit, int from, int to){
        return new Sensor(unit, from, to);
    }

    public static Sensor TempSensor(MeasureUnit unit, int from, int to) {
        Sensor s = new Sensor(unit, from, to);
        s.setConverter(new TemperatureConverter());
        return s;
    }

// =======================================================================================
    private static int ID = 0;

    private int sensorID;
    private MeasureUnit currentUnit;
    private IConverter converter;
    private int from;
    private int to;

    private Sensor(MeasureUnit currentUnit, int from, int to){
        this.sensorID = Sensor.ID++;
        this.currentUnit = currentUnit;
        this.from = from;
        this.to = to;
    }

    private void setConverter(IConverter converter){
        this.converter = converter;
    }

    public double getValue(){
        return from + (to - from)*Math.random();
    }

    private String[] getArgsArray(){
        String[] args = new String[2];
        args[0] = String.valueOf(getValue());
        args[1] = this.currentUnit.toString();
        return args;
    }

    public String getDataRecord(){
        String[] args = getArgsArray();
        return SensorData.getSensorData(args);
    }

    public void changeUnit(MeasureUnit newUnit){
        if(converter == null)
            return;

        try {
            this.from = (int) this.converter.convertValue(this.currentUnit, newUnit, this.from);
            this.to = (int) this.converter.convertValue(this.currentUnit, newUnit, this.to);
            this.currentUnit = newUnit;
        } catch(ConversionException e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public String toString(){
        return  "Sensor ID: " + this.sensorID + "\n" +
                "Default unit: " + this.currentUnit + "\n" +
                "Range goes from: " + this.from + " to " + this.to + "\n";
    }

}
