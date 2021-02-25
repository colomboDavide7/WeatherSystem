package BaseStationTests;

import com.githubcolomboDavide7.BaseStation.*;
import com.githubcolomboDavide7.MeasureSystem.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BaseStationTest {

    private IMeasureSystem ms1;
    private IMeasureSystem ms2;
    private WeatherBaseStation wbs;

    @Before
    public void setUp(){
        this.wbs = new WeatherBaseStation();
        this.ms1 = new MeasureSystem(MeasureSystemType.TEMPERATURE, 0, 15);
        this.ms2 = new MeasureSystem(MeasureSystemType.POLLUTION, 20, 50);
    }

    @Test
    public void  shouldAddMeasureSystemsToBaseStation() throws Exception {
        this.wbs.addMeasureSystem(this.ms1);
        this.wbs.addMeasureSystem(this.ms2);
        Assert.assertTrue(this.wbs.isNumberOfMeasureSystemEqualTo(2));
    }

    @Test (expected = Exception.class)
    public void shouldNotAddMeasureSystemIfAlreadyExistsOneOfTheSameType() throws Exception {
        this.wbs.addMeasureSystem(this.ms1);
        this.wbs.addMeasureSystem(this.ms1);
    }

    @Test
    public void shouldPrintListOfActiveMeasureSystem() throws Exception {
        this.wbs.addMeasureSystem(this.ms1);
        this.wbs.addMeasureSystem(this.ms2);
        String activeMS = wbs.printActiveMeasureSystems();
        StringBuilder sb = new StringBuilder();
        sb.append(this.ms1.toString()).append("\n").append(this.ms2.toString()).append("\n");
        Assert.assertEquals(sb.toString(), activeMS);
        System.out.println(sb.toString());
    }

    @Test
    public void shouldRemoveMeasureSystem() throws Exception {
        this.wbs.addMeasureSystem(this.ms1);
        this.wbs.addMeasureSystem(this.ms2);

        String activeMS = wbs.printActiveMeasureSystems();
        StringBuilder sb = new StringBuilder();
        sb.append(ms1.toString()).append("\n").append(ms2.toString()).append("\n");
        Assert.assertEquals(sb.toString(), activeMS);
        Assert.assertTrue(wbs.isNumberOfMeasureSystemEqualTo(2));
        System.out.println(sb.toString());

        // Remove ms at index 0
        wbs.removeMeasureSystem(this.ms1);
        Assert.assertTrue(wbs.isNumberOfMeasureSystemEqualTo(1));
        activeMS = wbs.printActiveMeasureSystems();
        sb = new StringBuilder();
        sb.append(ms2.toString()).append("\n");
        Assert.assertEquals(sb.toString(), activeMS);
        System.out.println(sb.toString());
    }

    @Test (expected = Exception.class)
    public void shouldTestRemoveWithoutThatSystem() throws Exception {
        this.wbs.addMeasureSystem(ms1);
        this.wbs.removeMeasureSystem(this.ms2);
    }


}
