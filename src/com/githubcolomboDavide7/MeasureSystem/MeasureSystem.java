package com.githubcolomboDavide7.MeasureSystem;

public class MeasureSystem {

    private MeasureUnit selectedUnit;
    private int from;
    private int to;

    public MeasureSystem(MeasureUnit unit, int from, int to){
        this.selectedUnit = unit;
        this.from = from;
        this.to = to;
    }

    public double getValue(){
        return from + (to - from)*Math.random();
    }

    public String getDataRecord(){
        return "";
    }

    public void changeUnit(MeasureUnit newUnit){
        try {
            this.from = (int) Converter.convertValue(this.selectedUnit, newUnit, this.from);
            this.to   = (int) Converter.convertValue(this.selectedUnit, newUnit, this.to);
            this.selectedUnit = newUnit;
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean isMeasureUnitEqual(MeasureUnit toCheck){
        return this.selectedUnit.equals(toCheck);
    }

}
