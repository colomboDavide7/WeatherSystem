package com.githubcolomboDavide7.MeasureSystem;

public enum MeasureUnit {

    Celsius, Fahrenheit,
    Pascal,  mmHg;

    static boolean isTempUnit(MeasureUnit unit){
        return unit == Celsius || unit == Fahrenheit;
    }

    static boolean isPressureUnit(MeasureUnit unit){
        return unit == Pascal || unit == mmHg;
    }

}
