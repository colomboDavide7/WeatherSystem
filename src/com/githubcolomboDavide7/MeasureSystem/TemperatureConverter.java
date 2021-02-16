package com.githubcolomboDavide7.MeasureSystem;

public class TemperatureConverter implements IConverter {

    private UnitMeasure from;
    private UnitMeasure to;

    public TemperatureConverter(UnitMeasure from, UnitMeasure to) {
        this.from = from;
        this.to = to;
    }

    // Sistemare
    @Override
    public double convertValue(double value) throws ConversionException {
        if((this.from != UnitMeasure.Celsius &&
           this.from != UnitMeasure.Fahrenheit) ||
                (this.to != UnitMeasure.Celsius &&
           this.to != UnitMeasure.Fahrenheit))
            throw new ConversionException("The from or to unit measure is illegal for this type of converter");

        if(this.from == UnitMeasure.Celsius)
            return fromCelsiusToFahrenheit(value);
        else
            return fromFahrenheitToCelsius(value);
    }

    private double fromCelsiusToFahrenheit(double value){
        return value*1.8000 + 32;
    }

    private double fromFahrenheitToCelsius(double value){
        return (value - 32)/1.8000;
    }

}
