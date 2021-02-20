package MeasureSystemTests;

import com.githubcolomboDavide7.MeasureSystem.*;
import org.junit.Assert;
import org.junit.Test;

public class MeasureSystemTest {

    @Test
    public void shouldAcquireValuesTest(){
        MeasureUnit unit = MeasureUnit.Celsius;
        int from = 10;
        int to = 30;
        MeasureSystem sys = new MeasureSystem(Sensor.TempSensor(from, to), unit);
        String dataRecord = sys.getDataRecord();
        String expectedDataRecord = "";
        Assert.assertEquals(expectedDataRecord, dataRecord);
    }

    @Test
    public void shouldTestChangeUnitMethod(){
        MeasureUnit unit = MeasureUnit.Celsius;
        int from = 10;
        int to = 30;
        MeasureSystem sys = new MeasureSystem(Sensor.TempSensor(from, to), unit);
        Assert.assertTrue(sys.isMeasureUnitEqual(MeasureUnit.Celsius));
        sys.changeUnit(MeasureUnit.Fahrenheit);
        Assert.assertTrue(sys.isMeasureUnitEqual(MeasureUnit.Fahrenheit));
    }

    @Test
    public void shouldTestChangeUnitMethodException(){
        MeasureUnit unit = MeasureUnit.Celsius;
        int from = 10;
        int to = 30;
        MeasureSystem sys = new MeasureSystem(Sensor.TempSensor(from, to), unit);
        Assert.assertTrue(sys.isMeasureUnitEqual(MeasureUnit.Celsius));
        sys.changeUnit(MeasureUnit.Pascal);
        Assert.assertTrue(sys.isMeasureUnitEqual(MeasureUnit.Celsius));
    }

}
