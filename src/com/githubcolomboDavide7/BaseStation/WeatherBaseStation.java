package com.githubcolomboDavide7.BaseStation;

import com.githubcolomboDavide7.MeasureSystem.*;
import java.util.*;

public class WeatherBaseStation {

    private final List<IMeasureSystem> measureSystems;

    public WeatherBaseStation(){
        this.measureSystems = new ArrayList<>();
    }

    public void addMeasureSystem(IMeasureSystem ms) throws Exception {
        if(alreadyExistsCompatibleMeasureSystem(ms))
            throw new Exception("");
        this.measureSystems.add(ms);
    }

    private boolean alreadyExistsCompatibleMeasureSystem(IMeasureSystem toCheck){
        for(IMeasureSystem ms : this.measureSystems)
            if(ms.isCompatibleUnit((MeasureSystem) toCheck))
                return true;
            return false;
    }

    public void removeMeasureSystem(int index){
        this.measureSystems.remove(index);
    }

    public boolean isNumberOfMeasureSystemEqualTo(int size){
        return this.measureSystems.size() == size;
    }

    public String printActiveMeasureSystems(){
        StringBuilder sb = new StringBuilder();
        for(IMeasureSystem ms : this.measureSystems)
            sb.append(ms.toString()).append("\n");
        return sb.toString();
    }

}
