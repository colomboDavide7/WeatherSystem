package com.githubcolomboDavide7.MeasureSystem;

public enum MeasureSystemType {

    TEMPERATURE(MeasureUnit.Celsius),
    POLLUTION(MeasureUnit.µg_m3),
    PRESSURE(MeasureUnit.mmHg);

    protected MeasureUnit defaultUnit;

    MeasureSystemType(MeasureUnit unit){
        this.defaultUnit = unit;
    }

}
