package ConverterTests;

import com.githubcolomboDavide7.Converter.*;
import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void shouldTestConversion(){
        IConverter fromCtoF = new FromCelsiusToFahrenheit();
        Assert.assertTrue(32 == fromCtoF.convertValue(0));
        Assert.assertTrue(131 == fromCtoF.convertValue(55));
        Assert.assertTrue(428 == fromCtoF.convertValue(220));

        IConverter fromFtoC = new FromFahrenheitToCelsius();
        Assert.assertTrue(0 == fromFtoC.convertValue(32));
        Assert.assertTrue(55 == fromFtoC.convertValue(131));
        Assert.assertTrue(220 == fromFtoC.convertValue(428));
    }

}
