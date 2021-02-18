package com.githubcolomboDavide7.MeasureSystem;

public class TemperatureConverter implements IConverter {

// =====================================================================================================================
    // Enum that defines conversion type
    private enum ConversionType{
        FROM_CELSIUS_TO_FAHRENHEIT(MeasureUnit.Celsius, MeasureUnit.Fahrenheit),
        FROM_FAHRENHEIT_TO_CELSIUS(MeasureUnit.Fahrenheit, MeasureUnit.Celsius);

        private MeasureUnit from;
        private MeasureUnit to;

        ConversionType(MeasureUnit from, MeasureUnit to){
            this.from = from;
            this.to   = to;
        }

        static ConversionType getConversionType(MeasureUnit from, MeasureUnit to) throws ConversionException {
            for(ConversionType v : ConversionType.values())
                if(v.from == from && v.to == to)
                    return v;
            throw new ConversionException();
        }

    }
// =====================================================================================================================

    @Override
    public double convertValue(MeasureUnit from, MeasureUnit to, double value) throws ConversionException{
        if(from == to)
            return value;

        switch(ConversionType.getConversionType(from, to)){
            case FROM_CELSIUS_TO_FAHRENHEIT:
                return fromCelsiusToFahrenheit(value);
            case FROM_FAHRENHEIT_TO_CELSIUS:
                return fromFahrenheitToCelsius(value);
            default:
                return -1;
        }
    }

    private double fromCelsiusToFahrenheit(double value){
        return value*1.8000 + 32;
    }

    private double fromFahrenheitToCelsius(double value){
        return (value - 32)/1.8000;
    }

}
