package com.githubcolomboDavide7.City;

public class CityInfo {

    private final String NAME_STRING = "CITY_NAME";
    private final String REGION_STRING = "CITY_REGION";
    private final String COUNTRY_STRING = "CITY_COUNTRY";

    private final String cityName;
    private final String cityRegion;
    private final String cityCountry;

    public CityInfo(String name, String region, String country){
        this.cityName = name;
        this.cityRegion = region;
        this.cityCountry = country;
    }

    protected boolean isSameCityName(String name){
        return name.equals(this.cityName);
    }

    protected boolean isSameRegion(String region){
        return region.equals(this.cityRegion);
    }

    protected boolean isSameCountry(String country){
        return country.equals(this.cityCountry);
    }

    @Override
    public String toString(){
        return this.NAME_STRING + " = " + this.cityName + "\t" +
                this.REGION_STRING + " = " + this.cityRegion + "\t" +
                this.COUNTRY_STRING + " = " + this.cityCountry + "\t";
    }

}
