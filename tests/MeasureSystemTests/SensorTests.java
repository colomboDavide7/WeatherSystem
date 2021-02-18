package MeasureSystemTests;

import com.githubcolomboDavide7.MeasureSystem.MeasureUnit;
import com.githubcolomboDavide7.MeasureSystem.Sensor;
import org.junit.Assert;
import org.junit.Test;

public class SensorTests {

    @Test
    public void shouldReturnTemperatureValue(){
        int from = 0;
        int to = 15;
        int value = (int) Sensor.TempSensor(MeasureUnit.Celsius, from, to).getValue();
        Assert.assertTrue(value >= from && value <= to);
    }

    @Test
    public void shouldReturnPM10Value(){
        int from = 20;
        int to = 70;
        int value = (int) Sensor.PM10Sensor(MeasureUnit.microg_per_m3, from, to).getValue();
        Assert.assertTrue(value >= from && value <= to);
    }

}
