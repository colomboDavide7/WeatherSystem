package com.githubcolomboDavide7.MeasureSystem;

public enum ConversionType {

    FROM_CELSIUS_TO_FAHRENHEIT(MeasureUnit.Celsius, MeasureUnit.Fahrenheit),
    FROM_FAHRENHEIT_TO_CELSIUS(MeasureUnit.Fahrenheit, MeasureUnit.Celsius);

    private MeasureUnit from;
    private MeasureUnit to;

    ConversionType(MeasureUnit from, MeasureUnit to){
        this.from = from;
        this.to   = to;
    }

    protected static ConversionType getConversionType(MeasureUnit from, MeasureUnit to) throws ConversionException{
        for(ConversionType v : ConversionType.values())
            if(v.from == from && v.to == to)
                return v;
        throw new ConversionException("MeasureUnit from = " + from + ", MeasureUnit to = " + to,
                                      ConversionException.ErrorCode.INVALID_CONVERSION);
    }

}
