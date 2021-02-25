package BaseStationTests;

import com.githubcolomboDavide7.BaseStation.WeatherBaseStation;
import com.githubcolomboDavide7.MeasureSystem.MeasureSystem;
import com.githubcolomboDavide7.MeasureSystem.MeasureUnit;
import org.junit.Assert;
import org.junit.Test;

public class BaseStationTest {

    @Test
    public void  shouldAddMeasureSystemsToBaseStation(){
        WeatherBaseStation wbs = new WeatherBaseStation();
        wbs.addMeasureSystem(new MeasureSystem(MeasureUnit.Celsius, 0, 15));
        wbs.addMeasureSystem(new MeasureSystem(MeasureUnit.microg_per_m3, 20, 50));
        Assert.assertTrue(wbs.isNumberOfMeasureSystemEqualTo(2));
    }

}
