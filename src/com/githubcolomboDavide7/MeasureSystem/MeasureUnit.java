package com.githubcolomboDavide7.MeasureSystem;

public enum MeasureUnit {

    Celsius, Fahrenheit,
    Pascal,  mmHg,
    microg_per_m3;

    static boolean isTempUnit(MeasureUnit unit){
        return unit == Celsius || unit == Fahrenheit;
    }

    static boolean isPressureUnit(MeasureUnit unit){
        return unit == Pascal || unit == mmHg;
    }

    static boolean isPollutionUnit(MeasureUnit unit){ return unit == microg_per_m3; }

}
