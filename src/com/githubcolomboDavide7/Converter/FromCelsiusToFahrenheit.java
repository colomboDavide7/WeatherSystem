package com.githubcolomboDavide7.Converter;

public class FromCelsiusToFahrenheit implements IConverter {

    @Override
    public double convertValue(double value){
        return (value*9)/(double)5 + 32;
    }

}
