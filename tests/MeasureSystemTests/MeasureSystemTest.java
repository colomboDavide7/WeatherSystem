package MeasureSystemTests;

import com.githubcolomboDavide7.MeasureSystem.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MeasureSystemTest {

    private List<Sensor> sensorList;
    @Before
    public void initializeSensorList(){
        this.sensorList = new ArrayList<>(2);
        sensorList.add(new TemperatureSensor(MeasureUnit.Celsius));
        sensorList.add(new PM10Sensor(MeasureUnit.microg_per_m3));
    }

    @Test
    public void shouldAcquireValuesTest(){
        MeasureSystem sys = new MeasureSystem(this.sensorList);
        List<Double> values = sys.acquireFromSensors();
        Assert.assertTrue(values.size() == 2);
    }

}
