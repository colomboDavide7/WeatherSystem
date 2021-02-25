package com.githubcolomboDavide7.BaseStation;

public enum FormatterScheme {

    SensorData("=", ";");

    public final String keyValueSeparator;
    public final String tokenSeparator;

    FormatterScheme(String keyValueSeparator, String tokenSeparator){
        this.keyValueSeparator = keyValueSeparator;
        this.tokenSeparator    = tokenSeparator;
    }

}
