package com.githubcolomboDavide7.BaseStation;

import com.githubcolomboDavide7.MeasureSystem.*;
import java.util.*;

public interface IWeatherBaseStation {

    void addMeasureSystem(IMeasureSystem ms) throws Exception;

    void removeMeasureSystem(IMeasureSystem toRemove) throws Exception;

    Iterator<IMeasureSystem> getMeasureSystemIterator();

}
