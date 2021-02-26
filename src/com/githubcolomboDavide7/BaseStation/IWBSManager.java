package com.githubcolomboDavide7.BaseStation;

import com.githubcolomboDavide7.MeasureSystem.*;

public interface IWBSManager {

    void addMeasureSystem(IMeasureSystem ms) throws Exception;

    void removeMeasureSystem(IMeasureSystem toRemove) throws Exception;

}
