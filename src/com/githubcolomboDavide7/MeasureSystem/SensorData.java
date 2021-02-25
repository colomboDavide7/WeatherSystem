package com.githubcolomboDavide7.MeasureSystem;

public class SensorData {

    private static String[] keys;
    private static final String VALUE_KEY = "VALUE";
    private static final String MEASURE_UNIT_KEY = "MEASURE_UNIT";
    private static final int numberOfRecord = 2;

    static{
        keys = new String[numberOfRecord];
        keys[0] = VALUE_KEY;
        keys[1] = MEASURE_UNIT_KEY;
    }

    public static String getSensorData(String[] args){
        return "";
                //DataFormatter.formatData(keys, args, FormatterScheme.SensorData);
    }

}
