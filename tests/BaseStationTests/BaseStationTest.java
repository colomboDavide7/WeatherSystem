package BaseStationTests;

import com.githubcolomboDavide7.BaseStation.*;
import com.githubcolomboDavide7.MeasureSystem.*;
import org.junit.Assert;
import org.junit.Test;

public class BaseStationTest {

    @Test
    public void  shouldAddMeasureSystemsToBaseStation() throws Exception {
        WeatherBaseStation wbs = new WeatherBaseStation();
        wbs.addMeasureSystem(new MeasureSystem(MeasureUnit.Celsius, 0, 15));
        wbs.addMeasureSystem(new MeasureSystem(MeasureUnit.microg_per_m3, 20, 50));
        Assert.assertTrue(wbs.isNumberOfMeasureSystemEqualTo(2));
    }

    @Test (expected = Exception.class)
    public void shouldNotAddMeasureSystemIfAlreadyExistsOneOfTheSameType() throws Exception {
        WeatherBaseStation wbs = new WeatherBaseStation();
        wbs.addMeasureSystem(new MeasureSystem(MeasureUnit.Celsius, 0, 15));
        wbs.addMeasureSystem(new MeasureSystem(MeasureUnit.Fahrenheit, 0, 15));
    }

    @Test
    public void shouldPrintListOfActiveMeasureSystem() throws Exception {
        WeatherBaseStation wbs = new WeatherBaseStation();
        IMeasureSystem ms1 = new MeasureSystem(MeasureUnit.Celsius, 0, 15);
        IMeasureSystem ms2 = new MeasureSystem(MeasureUnit.microg_per_m3, 20, 50);
        wbs.addMeasureSystem(ms1);
        wbs.addMeasureSystem(ms2);
        String activeMS = wbs.printActiveMeasureSystems();
        StringBuilder sb = new StringBuilder();
        sb.append(ms1.toString()).append("\n").append(ms2.toString()).append("\n");
        Assert.assertEquals(sb.toString(), activeMS);
        System.out.println(sb.toString());
    }

    @Test
    public void shouldRemoveMeasureSystem() throws Exception {
        WeatherBaseStation wbs = new WeatherBaseStation();
        IMeasureSystem ms1 = new MeasureSystem(MeasureUnit.Celsius, 0, 15);
        IMeasureSystem ms2 = new MeasureSystem(MeasureUnit.microg_per_m3, 20, 50);
        wbs.addMeasureSystem(ms1);
        wbs.addMeasureSystem(ms2);

        String activeMS = wbs.printActiveMeasureSystems();
        StringBuilder sb = new StringBuilder();
        sb.append(ms1.toString()).append("\n").append(ms2.toString()).append("\n");
        Assert.assertEquals(sb.toString(), activeMS);
        Assert.assertTrue(wbs.isNumberOfMeasureSystemEqualTo(2));
        System.out.println(sb.toString());

        // Remove ms at index 0
        wbs.removeMeasureSystem(0);
        Assert.assertTrue(wbs.isNumberOfMeasureSystemEqualTo(1));
        activeMS = wbs.printActiveMeasureSystems();
        sb = new StringBuilder();
        sb.append(ms2.toString()).append("\n");
        Assert.assertEquals(sb.toString(), activeMS);
        System.out.println(sb.toString());
    }


}
