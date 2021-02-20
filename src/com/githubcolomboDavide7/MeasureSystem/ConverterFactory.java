package com.githubcolomboDavide7.MeasureSystem;

public class ConverterFactory {

    public static IConverter getConverter(MeasureUnit selectedUnit) throws Exception {
        if(MeasureUnit.isTempUnit(selectedUnit))
            return new TemperatureConverter();
        throw new Exception("A converter for measure unit '" + selectedUnit + "' does not exist.\n");
    }

}
