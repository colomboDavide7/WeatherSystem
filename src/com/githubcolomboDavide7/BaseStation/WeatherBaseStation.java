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

    public void removeMeasureSystem(IMeasureSystem toRemove) throws Exception {
        if(!alreadyExistsCompatibleMeasureSystem(toRemove))
            throw new Exception("");
        this.measureSystems.removeIf(ms -> ms.isSystemOfSameType((MeasureSystem) toRemove));
    }

    private boolean alreadyExistsCompatibleMeasureSystem(IMeasureSystem toCheck){
        for(IMeasureSystem ms : this.measureSystems)
            if(ms.isSystemOfSameType((MeasureSystem) toCheck))
                return true;
        return false;
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
