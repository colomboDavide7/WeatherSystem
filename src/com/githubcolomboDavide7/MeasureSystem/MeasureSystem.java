package com.githubcolomboDavide7.MeasureSystem;

public class MeasureSystem implements IMeasureSystem {

    private final MeasureSystemType type;
    private int from;
    private int to;

    public MeasureSystem(MeasureSystemType type, int from, int to){
        this.type = type;
        this.from = from;
        this.to = to;
    }

    @Override
    public void changeUnit(MeasureUnit unit){
        try {
            this.from = (int) Converter.convertValue(this.type.defaultUnit, unit, this.from);
            this.to   = (int) Converter.convertValue(this.type.defaultUnit, unit, this.to);
            this.type.defaultUnit = unit;
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public double getValue(){
        return from + (to - from)*Math.random();
    }

    @Override
    public boolean isSystemOfSameType(MeasureSystem measureSystem) {
        return this.type.equals(measureSystem.type);
    }

    @Override
    public String toString(){
        return "SYSTEM TYPE = " + this.type + "\t" +
                "MEASURE_UNIT = " + this.type.defaultUnit + "\t" +
                "RANGE = " + this.from + " : " + this.to;
    }

// ==========================================================================================
    // These methods are called for testing
    public boolean isMeasureUnitEqual(MeasureUnit unit) {
        return this.type.defaultUnit.equals(unit);
    }

}
