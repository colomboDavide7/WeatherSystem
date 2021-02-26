package ConverterTests;

import com.githubcolomboDavide7.Converter.*;
import com.githubcolomboDavide7.MeasureSystem.*;
import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void shouldTestConversion(){
        IMSConfig ms = new MeasureSystem(MeasureSystemType.TEMPERATURE, 0, 55);
        IConverter fromCtoF = new FromCelsiusToFahrenheit();
        fromCtoF.convertMeasureSystem(ms);
        Assert.assertTrue(32 == ms.getFromValue());
        Assert.assertTrue(131 == ms.getToValue());
        Assert.assertTrue(MeasureUnit.Fahrenheit.equals(ms.getUnit()));

        IConverter fromFtoC = new FromFahrenheitToCelsius();
        fromFtoC.convertMeasureSystem(ms);
        Assert.assertTrue(0 == ms.getFromValue());
        Assert.assertTrue(55 == ms.getToValue());
        Assert.assertTrue(MeasureUnit.Celsius.equals(ms.getUnit()));
    }

}
