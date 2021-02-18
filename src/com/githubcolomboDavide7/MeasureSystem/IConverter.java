package com.githubcolomboDavide7.MeasureSystem;

public interface IConverter {

    // Polymorphic method that allows to convert a value
    double convertValue(MeasureUnit from, MeasureUnit to, double value) throws ConversionException;

}
