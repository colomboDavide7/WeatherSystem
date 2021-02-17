package com.githubcolomboDavide7.MeasureSystem;

public class TemperatureConverter implements IConverter {

    private ConversionType type;

    public TemperatureConverter(ConversionType type) {
        this.type = type;
    }

    @Override
    public double convertValue(double value) throws ConversionException {
        switch(this.type){
            case FROM_CELSIUS_TO_FAHRENHEIT:
                return fromCelsiusToFahrenheit(value);
            case FROM_FAHRENHEIT_TO_CELSIUS:
                return fromFahrenheitToCelsius(value);
            default:
                throw new ConversionException("Conversion type: '"+
                                              this.type +
                                              "' is invalid for TemperatureConverter!!!");
        }
    }

    private double fromCelsiusToFahrenheit(double value){
        return value*1.8000 + 32;
    }

    private double fromFahrenheitToCelsius(double value){
        return (value - 32)/1.8000;
    }

}
