package com.githubcolomboDavide7.City;

import com.githubcolomboDavide7.BaseStation.*;

public interface ICityManager {

    void addWeatherBaseStation(IWBSManager wbs);

    void removeWeatherBaseStation(IWBSManager wbs);

    boolean isNumberOfWBSEqualToN(int n);

}
