package com.githubcolomboDavide7.Converter;

import com.githubcolomboDavide7.MeasureSystem.IMSConfig;
import com.githubcolomboDavide7.MeasureSystem.MeasureUnit;

public class FromFahrenheitToCelsius implements IConverter {

    @Override
    public void convertMeasureSystem(IMSConfig measureSystem) {
        int from = (int) this.convertValue(measureSystem.getFromValue());
        int to   = (int) this.convertValue(measureSystem.getToValue());
        measureSystem.setFromValue(from);
        measureSystem.setToValue(to);
        measureSystem.setUnit(MeasureUnit.Celsius);
    }

    private double convertValue(int value){
        return ((value - 32)*5)/(double)9;
    }

}
