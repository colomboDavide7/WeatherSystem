package com.githubcolomboDavide7;

import com.githubcolomboDavide7.BaseStation.*;
import com.githubcolomboDavide7.Converter.*;
import com.githubcolomboDavide7.IOInterfaces.*;
import com.githubcolomboDavide7.MeasureSystem.*;

public class Main {

    public static void main(String[] args) throws Exception {

        IWBSManager wbs = new WeatherBaseStation();
        IMeasureSystem ms1 = new MeasureSystem(MeasureSystemType.TEMPERATURE, 10, 40);
        IMeasureSystem ms2 = new MeasureSystem(MeasureSystemType.POLLUTION, 20, 55);
        wbs.addMeasureSystem(ms1);
        wbs.addMeasureSystem(ms2);

        // Print active
        System.out.println(Printer.printActiveMeasureSystems((IWBSInputOutput) wbs));

        MeasureUnit newUnit = MeasureUnit.Fahrenheit;
        IConverter myConverter = ConverterFactory.getConverter(((IMSConfig) ms1).getUnit(), newUnit);
        myConverter.convertMeasureSystem((IMSConfig) ms1);

        // Print active
        System.out.println(Printer.printActiveMeasureSystems((IWBSInputOutput) wbs));

        newUnit = MeasureUnit.Pascal;
        myConverter = ConverterFactory.getConverter(((IMSConfig) ms2).getUnit(), newUnit);

    }

}
