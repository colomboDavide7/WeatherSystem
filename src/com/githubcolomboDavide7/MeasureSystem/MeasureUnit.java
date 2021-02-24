package com.githubcolomboDavide7.MeasureSystem;

public enum MeasureUnit {

    Celsius, Fahrenheit,
    Pascal,  mmHg,
    microg_per_m3;

    private static boolean isTempUnit(MeasureUnit unit){
        return unit == Celsius || unit == Fahrenheit;
    }

    private static boolean isPressureUnit(MeasureUnit unit){
        return unit == Pascal || unit == mmHg;
    }

    private static boolean isPollutionUnit(MeasureUnit unit){ return unit == microg_per_m3; }

    public static boolean areCompatible(MeasureUnit firstUnit, MeasureUnit secondUnit) {
        return (isTempUnit(firstUnit) && isTempUnit(secondUnit)) ||
                (isPollutionUnit(firstUnit) && isPollutionUnit(secondUnit)) ||
                (isPressureUnit(firstUnit) && isPressureUnit(secondUnit));
    }

}
