package com.githubcolomboDavide7.City;

import com.githubcolomboDavide7.BaseStation.*;
import java.util.*;

public class City implements ICityManager {

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

}
