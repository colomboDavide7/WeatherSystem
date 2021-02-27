package com.githubcolomboDavide7.City;

public interface ICityConfig {

    void putField(CityInfoField key, String value);

    boolean isSameField(CityInfoField toCompare, String value);

}
