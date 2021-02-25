package com.githubcolomboDavide7.MeasureSystem;

public class MeasureSystem implements IMeasureSystem {

    private MeasureUnit selectedUnit;
    private int from;
    private int to;

    public MeasureSystem(MeasureUnit unit, int from, int to){
        this.selectedUnit = unit;
        this.from = from;
        this.to = to;
    }

    @Override
    public void changeUnit(MeasureUnit unit){
        try {
            this.from = (int) Converter.convertValue(this.selectedUnit, unit, this.from);
            this.to   = (int) Converter.convertValue(this.selectedUnit, unit, this.to);
            this.selectedUnit = unit;
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public boolean isCompatibleUnit(MeasureSystem measureSystem) {
        return MeasureUnit.areCompatible(this.selectedUnit, measureSystem.selectedUnit);
    }

    @Override
    public double getValue(){
        return from + (to - from)*Math.random();
    }

// ==========================================================================================
    // These methods are called for testing
    public boolean isMeasureUnitEqual(MeasureUnit unit) {
        return this.selectedUnit.equals(unit);
    }

}
