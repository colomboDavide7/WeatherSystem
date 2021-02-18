package MeasureSystemTests;

import com.githubcolomboDavide7.MeasureSystem.MeasureUnit;
import com.githubcolomboDavide7.MeasureSystem.PM10Sensor;
import com.githubcolomboDavide7.MeasureSystem.Sensor;
import com.githubcolomboDavide7.MeasureSystem.TemperatureSensor;
import org.junit.Assert;
import org.junit.Test;

public class SensorTests {

    @Test
    public void shouldReturnTemperatureValue(){
        Sensor tempSensor = new TemperatureSensor(MeasureUnit.Celsius);
        int value = (int) tempSensor.getSensorValue();
        Assert.assertTrue(value >= 0 && value <= 15);
        System.out.println(tempSensor.toString());
    }

    @Test
    public void shouldReturnPM10Value(){
        Sensor pm10Sensor = new PM10Sensor(MeasureUnit.microg_per_m3);
        int value = (int) pm10Sensor.getSensorValue();
        Assert.assertTrue(value >= 20 && value <= 100);
        System.out.println(pm10Sensor.toString());
    }

}
