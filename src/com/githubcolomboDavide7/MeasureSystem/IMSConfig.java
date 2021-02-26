package com.githubcolomboDavide7.MeasureSystem;

public interface IMSConfig {

    int getFromValue();

    void setFromValue(int from);

    int getToValue();

    void setToValue(int to);

    MeasureUnit getUnit();

    void setUnit(MeasureUnit unit);

}
