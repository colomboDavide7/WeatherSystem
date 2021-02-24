package MeasureSystemTests;

import com.githubcolomboDavide7.MeasureSystem.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MeasureSystemTest {

    private MeasureSystem sys;

    @Before
    public void setUpMeasureSystem(){
        MeasureUnit unit = MeasureUnit.Celsius;
        int from = 10;
        int to = 30;
        this.sys = new MeasureSystem(unit, from, to);
    }

    @Test
    public void shouldAcquireValuesTest(){
        String dataRecord = this.sys.getDataRecord();
        String expectedDataRecord = "";
        Assert.assertEquals(expectedDataRecord, dataRecord);
    }

    @Test
    public void shouldTestChangeUnitMethod(){
        Assert.assertTrue(this.sys.isMeasureUnitEqual(MeasureUnit.Celsius));
        sys.changeUnit(MeasureUnit.Fahrenheit);
        Assert.assertTrue(this.sys.isMeasureUnitEqual(MeasureUnit.Fahrenheit));
    }

    @Test
    public void shouldTestChangeUnitMethodException(){
        Assert.assertTrue(this.sys.isMeasureUnitEqual(MeasureUnit.Celsius));
        sys.changeUnit(MeasureUnit.Pascal);
        Assert.assertTrue(this.sys.isMeasureUnitEqual(MeasureUnit.Celsius));
    }

}
