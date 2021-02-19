package com.githubcolomboDavide7.MeasureSystem;

public class DataFormatter  {

    public static String formatData(String[] key, String[] args, FormatterScheme scheme) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < args.length; i++)
            builder.append(key[i]).append(scheme.keyValueSeparator).append(args[i]).append(scheme.tokenSeparator);
        return builder.toString();
    }

}
