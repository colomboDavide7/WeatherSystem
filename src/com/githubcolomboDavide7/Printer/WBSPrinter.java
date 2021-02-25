package com.githubcolomboDavide7.Printer;

import com.githubcolomboDavide7.MeasureSystem.*;
import java.util.*;

public class WBSPrinter {

    public static String printActiveMeasureSystems(List<IMeasureSystem> measureSystemList){
        StringBuilder sb = new StringBuilder();
        for(IMeasureSystem ms : measureSystemList)
            sb.append(ms.toString()).append("\n");
        return sb.toString();
    }

}
