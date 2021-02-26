package PrinterTests;

import com.githubcolomboDavide7.BaseStation.*;
import com.githubcolomboDavide7.IOInterfaces.Printer;
import com.githubcolomboDavide7.MeasureSystem.*;

import org.junit.Assert;
import org.junit.Test;

public class PrinterTest {

    @Test
    public void shouldPrintActiveMeasureSystems() throws Exception {
        IWBSManager wbs = new WeatherBaseStation();
        IMeasureSystem ms1 = new MeasureSystem(MeasureSystemType.TEMPERATURE, 0, 15);
        IMeasureSystem ms2 = new MeasureSystem(MeasureSystemType.POLLUTION, 20, 50);
        wbs.addMeasureSystem(ms1);
        wbs.addMeasureSystem(ms2);
        // Actual value
        String actual = Printer.printActiveMeasureSystems((IWBSInputOutput) wbs);

        // Expected value
        StringBuilder sb = new StringBuilder();
        sb.append(ms1.toString()).append("\n").append(ms2.toString()).append("\n");
        Assert.assertEquals(sb.toString(), actual);
        System.out.println(actual);
    }

}
