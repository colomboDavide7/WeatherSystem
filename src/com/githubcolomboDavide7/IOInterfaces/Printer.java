package com.githubcolomboDavide7.IOInterfaces;

import com.githubcolomboDavide7.BaseStation.*;
import com.githubcolomboDavide7.MeasureSystem.*;
import java.util.*;

public class Printer {

    public static String printActiveMeasureSystems(IWBSInputOutput wbs) {
        StringBuilder sb = new StringBuilder();
        for(Iterator<IMeasureSystem> iter = wbs.getMeasureSystemIterator(); iter.hasNext(); )
            sb.append(iter.next().toString()).append("\n");
        return sb.toString();
    }

}
