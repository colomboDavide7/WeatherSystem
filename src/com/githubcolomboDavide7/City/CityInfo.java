package com.githubcolomboDavide7.City;

import java.util.*;

public class CityInfo {

    private final Map<CityInfoField, String> fields;

    public CityInfo(Map<CityInfoField, String> fields){
        this.fields = fields;
    }

    protected void putField(CityInfoField key, String value){
        this.fields.put(key, value);
    }

    protected boolean isSameField(CityInfoField toCompare, String value){
        return value.equals(this.fields.get(toCompare));
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(CityInfoField key : this.fields.keySet())
            sb.append(key).append(" = ").append(fields.get(key)).append("\t");
        return sb.toString();
    }

}
