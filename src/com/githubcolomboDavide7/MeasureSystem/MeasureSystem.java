package com.githubcolomboDavide7.MeasureSystem;

public class MeasureSystem {

    // The sensor object who generates data
    private Sensor sensor;
    private MeasureUnit selectedUnit;

    public MeasureSystem(Sensor s, MeasureUnit unit){
        this.sensor = s;
        this.selectedUnit = unit;
    }

    public String getDataRecord(){
        return "";
    }

    public void changeUnit(MeasureUnit newUnit){
        try {
            IConverter c = ConverterFactory.getConverter(this.selectedUnit);
            this.sensor.changeUnit(c, this.selectedUnit, newUnit);
            this.selectedUnit = newUnit;
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean isMeasureUnitEqual(MeasureUnit toCheck){
        return this.selectedUnit.equals(toCheck);
    }

}
