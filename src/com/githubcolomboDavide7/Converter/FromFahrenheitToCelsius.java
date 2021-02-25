package com.githubcolomboDavide7.Converter;

public class FromFahrenheitToCelsius implements IConverter {

    @Override
    public double convertValue(double value) {
        return ((value - 32)*5)/(double)9;
    }

}
