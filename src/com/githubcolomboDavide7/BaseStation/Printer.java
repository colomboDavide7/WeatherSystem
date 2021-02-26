package com.githubcolomboDavide7.BaseStation;

import com.githubcolomboDavide7.MeasureSystem.*;
import java.util.*;

public class Printer {

    public static String printActiveMeasureSystems(Iterator<IMeasureSystem> measureSystemIterator) {
        StringBuilder sb = new StringBuilder();
        while(measureSystemIterator.hasNext())
            sb.append(measureSystemIterator.next().toString()).append("\n");
        return sb.toString();
    }

}
