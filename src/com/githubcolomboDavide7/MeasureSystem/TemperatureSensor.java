package com.githubcolomboDavide7.MeasureSystem;

public class TemperatureSensor extends Sensor {

    public TemperatureSensor(){
        super();
        super.defaultUnit = super.requiredUnit = MeasureUnit.Celsius;
    }

    // Return a value between 0 and 15 for the default unit (Celsius)
    @Override
    public double getSensorValue() {
        double value = 0 + 15*Math.random();
        try {
            if(super.defaultUnit != super.requiredUnit)
                return new TemperatureConverter(super.defaultUnit, super.requiredUnit).convertValue(value);
        } catch(ConversionException e) {
                System.out.println(e.getMessage());
                // Throw specific exception here... if any
        }
        return  value;
    }

    @Override
    public void setRequiredUnit(MeasureUnit unit) {
        super.requiredUnit = unit;
    }

}
