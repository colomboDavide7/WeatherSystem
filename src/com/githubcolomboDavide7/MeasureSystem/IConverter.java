package com.githubcolomboDavide7.MeasureSystem;

public interface IConverter {

    // Polymorphic method that allows to convert a value
    double convertValue(double value) throws ConversionException;

}
