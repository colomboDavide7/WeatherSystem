package com.githubcolomboDavide7.MeasureSystem;

public enum MeasureUnit {

    Celsius, Fahrenheit, Pascal;

    static boolean isValidTempMeasureUnit(MeasureUnit unit){
        return unit == Celsius ||
                unit == Fahrenheit;
    }
}
