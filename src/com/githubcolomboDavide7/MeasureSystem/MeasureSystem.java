package com.githubcolomboDavide7.MeasureSystem;

public class MeasureSystem implements IMeasureSystem {

    private static int ID = 0;

    private final MeasureSystemType type;
    private final int idNumber;
    private int from;
    private int to;

    public MeasureSystem(MeasureSystemType type, int from, int to){
        this.type = type;
        this.idNumber = ID++;
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
    public boolean isSameType(MeasureSystem measureSystem) {
        return this.type.equals(measureSystem.type);
    }

    public boolean equals(MeasureSystem toCheck){
        return this.idNumber == toCheck.idNumber;
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
