package com.githubcolomboDavide7.Converter;

import com.githubcolomboDavide7.MeasureSystem.*;

public class FromCelsiusToFahrenheit implements IConverter {

    @Override
    public void convertMeasureSystem(IMSConfig measureSystem) {
        int from = (int) this.convertValue(measureSystem.getFromValue());
        int to   = (int) this.convertValue(measureSystem.getToValue());
        measureSystem.setFromValue(from);
        measureSystem.setToValue(to);
        measureSystem.setUnit(MeasureUnit.Fahrenheit);
    }

    private double convertValue(int value){
        return (value*9)/(double)5 + 32;
    }

}
