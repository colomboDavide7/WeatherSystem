package com.githubcolomboDavide7.MeasureSystem;

public class Converter {

    public static double convertValue(MeasureUnit fromUnit, MeasureUnit toUnit, double value) throws Exception{
        switch(ConversionType.getConversionType(fromUnit, toUnit)){
            case FROM_CELSIUS_TO_FAHRENHEIT:
                return fromCelsiusToFahrenheit(value);
            case FROM_FAHRENHEIT_TO_CELSIUS:
                return fromFahrenheitToCelsius(value);
            default:
                return 0;   // not good
        }
    }

    private static double fromCelsiusToFahrenheit(double value){
        return value*1.8000 + 32;
    }

    private static double fromFahrenheitToCelsius(double value){
        return (value - 32)/1.8000;
    }

}
