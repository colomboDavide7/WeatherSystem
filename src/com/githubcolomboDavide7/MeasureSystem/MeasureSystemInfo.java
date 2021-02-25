package com.githubcolomboDavide7.MeasureSystem;

public class MeasureSystemInfo {

    private static int ID_NUMBER = 0;

    private final String STRING_ID   = "SYSTEM_ID";
    private final String STRING_TYPE = "SYSTEM_TYPE";
    private final String STRING_UNIT = "SYSTEM_UNIT";
    private final int idNumber;
    private final MeasureSystemType type;

    protected MeasureSystemInfo(MeasureSystemType type){
        this.idNumber = ID_NUMBER++;
        this.type = type;
    }

    protected MeasureUnit getSelectedMeasureUnit(){
        return this.type.defaultUnit;
    }

    protected void setMeasureUnit(MeasureUnit unit){
        this.type.defaultUnit = unit;
    }

    protected boolean isSameType(MeasureSystemInfo info){
        return this.type.equals(info.type);
    }

    protected boolean isSameIdNumber(MeasureSystemInfo info){
        return this.idNumber == info.idNumber;
    }

    @Override
    public String toString(){
        return this.STRING_ID + " = " + this.idNumber + "\t" +
                this.STRING_TYPE + " = " + this.type + "\t" +
                this.STRING_UNIT + " = " + this.type.defaultUnit + "\t";
    }

}
