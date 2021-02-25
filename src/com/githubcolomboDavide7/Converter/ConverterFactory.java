package com.githubcolomboDavide7.Converter;

import com.githubcolomboDavide7.MeasureSystem.MeasureUnit;

public class ConverterFactory {

    public static IConverter getConverter(MeasureUnit from, MeasureUnit to) throws Exception {
        if(from == MeasureUnit.Celsius && to == MeasureUnit.Fahrenheit)
            return new FromCelsiusToFahrenheit();
        else if(from == MeasureUnit.Fahrenheit && to == MeasureUnit.Celsius)
            return new FromFahrenheitToCelsius();
        else
            throw new Exception("Wrong conversion from " + from + " to " + to + "\n");
    }

}
