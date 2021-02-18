package com.githubcolomboDavide7.MeasureSystem;

import java.util.ArrayList;
import java.util.List;

public class MeasureSystem {

    private final List<Sensor> sensorList;

    public MeasureSystem(List<Sensor> sensorList){
        this.sensorList = sensorList;
    }

    public List<Double> acquireFromSensors(){
        List<Double> values = new ArrayList<>(this.sensorList.size());
        for(Sensor s : sensorList)
            values.add(s.getSensorValue());
        return values;
    }

    public void addSensor(Sensor toAdd){
        this.sensorList.add(toAdd);
    }

}
