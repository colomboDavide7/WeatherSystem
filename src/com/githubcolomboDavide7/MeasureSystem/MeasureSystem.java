package com.githubcolomboDavide7.MeasureSystem;

import com.githubcolomboDavide7.Converter.*;

public class MeasureSystem implements IMeasureSystem {

    private final MeasureSystemInfo info;
    private int from;
    private int to;

    public MeasureSystem(MeasureSystemType type, int from, int to){
        info = new MeasureSystemInfo(type);
        this.from = from;
        this.to = to;
    }

    @Override
    public void changeUnit(MeasureUnit unit){
        try {
            IConverter myConverter = ConverterFactory.getConverter(this.info.getSelectedMeasureUnit(), unit);
            this.from = (int) myConverter.convertValue(this.from);
            this.to   = (int) myConverter.convertValue(this.to);
            this.info.setMeasureUnit(unit);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public double getValue() { return from + (to - from)*Math.random(); }

    @Override
    public boolean isSameType(MeasureSystem measureSystem) {
        return this.info.isSameType(measureSystem.info);
    }

    @Override
    public boolean isSameIdNumber(MeasureSystem measureSystem){
        return this.info.isSameIdNumber(measureSystem.info);
    }

    @Override
    public String toString(){
        return this.info.toString() +
                "RANGE = " + this.from + " : " + this.to;
    }

// ==========================================================================================
    // These methods are called for testing
    public boolean isMeasureUnitEqual(MeasureUnit unit) {
        return this.info.getSelectedMeasureUnit().equals(unit);
    }

}
