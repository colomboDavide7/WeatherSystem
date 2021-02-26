package com.githubcolomboDavide7.MeasureSystem;

public class MeasureSystem implements IMeasureSystem, IMSConfig {

    private final MeasureSystemInfo info;
    private int from;
    private int to;

    public MeasureSystem(MeasureSystemType type, int from, int to){
        info = new MeasureSystemInfo(type);
        this.from = from;
        this.to = to;
    }

    @Override
    public double getValue() { return from + (to - from)*Math.random(); }

// ==========================================================================================
    @Override
    public int getFromValue() {
        return this.from;
    }

    @Override
    public void setFromValue(int from) {
        this.from = from;
    }

    @Override
    public int getToValue() {
        return this.to;
    }

    @Override
    public void setToValue(int to) {
        this.to = to;
    }

    @Override
    public MeasureUnit getUnit() {
        return this.info.getSelectedMeasureUnit();
    }

    @Override
    public void setUnit(MeasureUnit unit) {
        this.info.setMeasureUnit(unit);
    }

// ==========================================================================================
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

}
