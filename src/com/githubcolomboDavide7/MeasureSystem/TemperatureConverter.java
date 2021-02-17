package com.githubcolomboDavide7.MeasureSystem;

public class TemperatureConverter implements IConverter {

    private MeasureUnit from;
    private MeasureUnit to;

    public TemperatureConverter(MeasureUnit from, MeasureUnit to) {
        this.from = from;
        this.to   = to;
    }

    @Override
    public double convertValue(double value) throws ConversionException {
        if(!MeasureUnit.isValidTempMeasureUnit(this.from) ||
           !MeasureUnit.isValidTempMeasureUnit(this.to))
            throw new ConversionException("Invalid 'from' or 'to' measure unit for temperature converter...\n" +
                                          "FROM = " + this.from +
                                          "TO   = " + this.to + "\n");

        if(this.from == MeasureUnit.Celsius && this.to == MeasureUnit.Fahrenheit)
            return fromCelsiusToFahrenheit(value);
        else if(this.from == MeasureUnit.Fahrenheit && this.to == MeasureUnit.Celsius)
            return fromFahrenheitToCelsius(value);
        else
            return value;
    }

    private double fromCelsiusToFahrenheit(double value){
        return value*1.8000 + 32;
    }

    private double fromFahrenheitToCelsius(double value){
        return (value - 32)/1.8000;
    }

}
