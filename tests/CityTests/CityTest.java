package CityTests;

import com.githubcolomboDavide7.BaseStation.*;
import com.githubcolomboDavide7.City.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CityTest {

    private ICityManager city;
    private CityInfo info;

    @Before
    public void setUp(){
        String name = "Pavia";
        String region = "Lombardia";
        String country = "Italia";
        this.info = new CityInfo(name, region, country);
        this.city = new City(info);
    }

    @Test
    public void shouldTestAddWBS(){
        IWBSManager wbs = new WeatherBaseStation();
        city.addWeatherBaseStation(wbs);
        Assert.assertTrue(city.isNumberOfWBSEqualToN(1));
    }

}
