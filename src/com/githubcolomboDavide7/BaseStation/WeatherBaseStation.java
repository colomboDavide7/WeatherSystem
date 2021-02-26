package com.githubcolomboDavide7.BaseStation;

import com.githubcolomboDavide7.MeasureSystem.*;
import java.util.*;

public class WeatherBaseStation implements IWBSManager, IWBSInputOutput {

    private final List<IMeasureSystem> measureSystems;

    public WeatherBaseStation(){
        this.measureSystems = new ArrayList<>();
    }

    @Override
    public void addMeasureSystem(IMeasureSystem ms) throws Exception {
        if(alreadyExistsCompatibleMeasureSystem(ms))
            throw new Exception("");
        this.measureSystems.add(ms);
    }

    private boolean alreadyExistsCompatibleMeasureSystem(IMeasureSystem toCheck){
        for(IMeasureSystem ms : this.measureSystems)
            if(ms.isSameType((MeasureSystem) toCheck))
                return true;
        return false;
    }

    @Override
    public void removeMeasureSystem(IMeasureSystem toRemove) throws Exception {
        if(!alreadyExistSpecificMeasureSystem(toRemove))
            throw new Exception("");
        this.measureSystems.removeIf(ms -> ms.isSameType((MeasureSystem) toRemove));
    }

    private boolean alreadyExistSpecificMeasureSystem(IMeasureSystem toCheck){
        for(IMeasureSystem ms : this.measureSystems)
            if(ms.isSameIdNumber((MeasureSystem) toCheck))
                return true;
            return false;
    }

    @Override
    public Iterator<IMeasureSystem> getMeasureSystemIterator() {
        return this.measureSystems.iterator();
    }

    public boolean isNumberOfMeasureSystemEqualTo(int size){
        return this.measureSystems.size() == size;
    }

}
