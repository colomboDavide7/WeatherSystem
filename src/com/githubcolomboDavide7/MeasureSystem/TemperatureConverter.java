package com.githubcolomboDavide7.MeasureSystem;

public class TemperatureConverter implements IConverter {

    @Override
    public String toString(){
        return "Converter = " + TemperatureConverter.class.getSimpleName();
    }

    @Override
    public double convertValue(MeasureUnit from, MeasureUnit to, double value) throws ConversionException{
        // is temp unit?
        if(!MeasureUnit.isTempUnit(from) || !MeasureUnit.isTempUnit(to))
            throw new ConversionException(toString() + ", MeasureUnit from = " + from + ", MeasureUnit to = " + to,
                                          ConversionException.ErrorCode.INVALID_MEASURE_UNIT);

        // same measure unit
        if(from == to)
            return value;

        // Conversion logic
        switch(ConversionType.getConversionType(from, to)){
            case FROM_CELSIUS_TO_FAHRENHEIT:
                return fromCelsiusToFahrenheit(value);
            case FROM_FAHRENHEIT_TO_CELSIUS:
                return fromFahrenheitToCelsius(value);
            default:
                throw new ConversionException();
        }
    }

    private double fromCelsiusToFahrenheit(double value){
        return value*1.8000 + 32;
    }

    private double fromFahrenheitToCelsius(double value){
        return (value - 32)/1.8000;
    }

}
