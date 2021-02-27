package com.githubcolomboDavide7.City;

import com.githubcolomboDavide7.BaseStation.*;
import java.util.*;

public class City implements ICityManager, ICityConfig {

    private final List<IWBSManager> wbsList;
    private final CityInfo info;

    public City(CityInfo info){
        this.wbsList = new ArrayList<>();
        this.info = info;
    }

    @Override
    public void addWeatherBaseStation(IWBSManager wbs) {
        this.wbsList.add(wbs);
    }

    @Override
    public void removeWeatherBaseStation(IWBSManager wbs) {
        this.wbsList.remove(wbs);
    }

    @Override
    public boolean isNumberOfWBSEqualToN(int n) {
        return n == this.wbsList.size();
    }

    @Override
    public void putField(CityInfoField key, String value) {
        this.info.putField(key, value);
    }

    @Override
    public boolean isSameField(CityInfoField toCompare, String value) {
        return this.info.isSameField(toCompare, value);
    }

    @Override
    public String toString(){
        return this.info.toString();
    }

}
