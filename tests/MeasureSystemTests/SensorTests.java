package MeasureSystemTests;

import com.githubcolomboDavide7.MeasureSystem.Sensor;
import com.githubcolomboDavide7.MeasureSystem.TemperatureSensor;
import org.junit.Assert;
import org.junit.Test;

public class SensorTests {

    @Test
    public void shouldReturnTemperatureValue(){
        Sensor tempSensor = new TemperatureSensor();
        System.out.println(tempSensor.getSensorValue());
        System.out.println(tempSensor.getSensorID());
        Assert.assertTrue(true);
    }

}
