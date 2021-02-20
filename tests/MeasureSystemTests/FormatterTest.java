package MeasureSystemTests;

import com.githubcolomboDavide7.MeasureSystem.DataFormatter;
import com.githubcolomboDavide7.MeasureSystem.FormatterScheme;
import com.githubcolomboDavide7.MeasureSystem.MeasureUnit;
import com.githubcolomboDavide7.MeasureSystem.Sensor;
import org.junit.Assert;
import org.junit.Test;

public class FormatterTest {

    @Test
    public void shouldTestFormatterMethod(){
        String[] key = new String[2];
        key[0] = "VALUE";
        key[1] = "MEASURE_UNIT";
        String[] args = new String[2];
        args[0] = "2.0";
        args[1] = MeasureUnit.Celsius.toString();
        String formattedData = DataFormatter.formatData(key, args, FormatterScheme.SensorData);
        String expectedData = "VALUE=2.0;MEASURE_UNIT=Celsius;";
        Assert.assertEquals(expectedData, formattedData);
    }

    /*
    @Test
    public void shouldTestSensorDataFormatting(){
        Sensor s = Sensor.TempSensor(MeasureUnit.Celsius, 10, 30);
        String dataRecord = s.getDataRecord();
        System.out.println(dataRecord);
    }*/

}
