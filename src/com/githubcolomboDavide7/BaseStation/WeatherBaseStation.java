package com.githubcolomboDavide7.BaseStation;

import com.githubcolomboDavide7.MeasureSystem.IMeasureSystem;

import java.util.ArrayList;
import java.util.List;

public class WeatherBaseStation {

    private List<IMeasureSystem> measureSystems;

    public WeatherBaseStation(){
        this.measureSystems = new ArrayList<>();
    }

    public void addMeasureSystem(IMeasureSystem ms){
        this.measureSystems.add(ms);
    }

    public boolean isNumberOfMeasureSystemEqualTo(int size){
        return this.measureSystems.size() == size;
    }

}
