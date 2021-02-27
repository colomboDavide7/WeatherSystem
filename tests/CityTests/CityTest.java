package CityTests;

import com.githubcolomboDavide7.BaseStation.*;
import com.githubcolomboDavide7.City.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class CityTest {

    private ICityManager city;

    @Before
    public void setUp(){
        Map<CityInfoField, String> fields = new HashMap<>();
        fields.put(CityInfoField.Name, "Pavia");
        fields.put(CityInfoField.Region, "Lombardia");
        fields.put(CityInfoField.Country, "Italia");
        CityInfo info = new CityInfo(fields);
        this.city = new City(info);
    }

    @Test
    public void shouldTestAddWBS(){
        IWBSManager wbs = new WeatherBaseStation();
        city.addWeatherBaseStation(wbs);
        Assert.assertTrue(city.isNumberOfWBSEqualToN(1));
        System.out.println(city.toString());
    }

    @Test
    public void shouldTestPutField(){
        Assert.assertTrue(((ICityConfig) city).isSameField(CityInfoField.Name, "Pavia"));
        ((ICityConfig) city).putField(CityInfoField.Name, "Milano");
        Assert.assertTrue(((ICityConfig) city).isSameField(CityInfoField.Name, "Milano"));

    }

}
