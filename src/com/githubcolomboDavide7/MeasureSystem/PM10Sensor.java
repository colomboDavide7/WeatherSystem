package com.githubcolomboDavide7.MeasureSystem;

public class PM10Sensor extends Sensor  {

    public PM10Sensor(MeasureUnit defaultUnit) {
        super(defaultUnit);
    }

    // This method returns a value for PM10
    @Override
    public double getSensorValue() {
        return 20 + 80*Math.random();
    }

}
