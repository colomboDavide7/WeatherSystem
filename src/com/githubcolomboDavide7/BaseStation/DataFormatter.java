package com.githubcolomboDavide7.BaseStation;

import java.util.*;

public class DataFormatter  {

    public static String formatData(Map<String, String> keyValues, FormatterScheme scheme) {
        StringBuilder builder = new StringBuilder();
        for(String key : keyValues.keySet())
            builder.append(key)
                    .append(scheme.keyValueSeparator)
                    .append(keyValues.get(key))
                    .append(scheme.tokenSeparator);
        return builder.toString();
    }

}
