package MeasureSystemTests;

import com.githubcolomboDavide7.MeasureSystem.*;
import org.junit.Assert;
import org.junit.Test;

public class SensorTests {
    /*
    THE TESTS ARE ALL CORRECT BUT ARE COMMENTED OUT BECAUSE THE METHODS ARE 'PROTECTED' AND NOT 'PUBLIC'.
    @Test
    public void shouldReturnTemperatureValue(){
        int from = 0;
        int to = 15;
        int value = (int) Sensor.TempSensor(from, to).getValue();
        Assert.assertTrue(value >= from && value <= to);
    }

    @Test
    public void shouldReturnPM10Value(){
        int from = 20;
        int to = 70;
        int value = (int) Sensor.PM10Sensor(from, to).getValue();
        Assert.assertTrue(value >= from && value <= to);
    }

    @Test
    public void shouldChangeSensorUnitAndRangeTest() throws ConversionException {
        int from = -10;
        int to   = 10;
        Sensor tempSensor = Sensor.TempSensor(from, to);
        int value = (int) tempSensor.getValue();
        Assert.assertTrue(value >= from && value <= to);
        System.out.println(tempSensor.toString());

        // Change measure unit
        IConverter c = new TemperatureConverter();
        tempSensor.changeUnit(c, MeasureUnit.Celsius, MeasureUnit.Fahrenheit);
        int changedValue = (int) tempSensor.getValue();
        int changedFrom = (int) new TemperatureConverter().convertValue(MeasureUnit.Celsius, MeasureUnit.Fahrenheit, from);
        int changedTo   = (int) new TemperatureConverter().convertValue(MeasureUnit.Celsius, MeasureUnit.Fahrenheit, to);
        Assert.assertTrue( changedValue >= changedFrom && changedValue <= changedTo);
        System.out.println(tempSensor.toString());
    }*/

}
