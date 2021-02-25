package com.githubcolomboDavide7.MeasureSystem;

public enum MeasureSystemType {

    TEMPERATURE(MeasureUnit.Celsius),
    POLLUTION(MeasureUnit.microg_per_m3),
    PRESSURE(MeasureUnit.mmHg);

    public MeasureUnit defaultUnit;

    MeasureSystemType(MeasureUnit unit){
        this.defaultUnit = unit;
    }

}
