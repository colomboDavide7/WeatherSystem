package MeasureSystemTests;

import com.githubcolomboDavide7.MeasureSystem.*;
import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void shouldConvertCelsiusToFahrenheit() throws ConversionException {
        double celsiusValue  = 0;
        double expectedValue = 32;
        double actualValue   = new TemperatureConverter().convertValue(
                MeasureUnit.Celsius, MeasureUnit.Fahrenheit, celsiusValue
        );
        // 0 °C == 32 °F
        Assert.assertTrue(expectedValue == actualValue);

        celsiusValue  = 9;
        expectedValue = 48.20;
        actualValue   = new TemperatureConverter().convertValue(
                MeasureUnit.Celsius, MeasureUnit.Fahrenheit, celsiusValue
        );
        // 9 °C == 48.20 °F
        Assert.assertTrue(expectedValue == actualValue);
    }

    @Test
    public void shouldConvertFromFahrenheitToCelsius() throws ConversionException {
        double fahrenheitValue  = 32;
        double expectedValue = 0;
        double actualValue   = new TemperatureConverter().convertValue(
                MeasureUnit.Fahrenheit, MeasureUnit.Celsius, fahrenheitValue
        );
        // 32 °F == 0 °C
        Assert.assertTrue(expectedValue == actualValue);

        fahrenheitValue  = 131;
        expectedValue = 55;
        actualValue   = new TemperatureConverter().convertValue(
                MeasureUnit.Fahrenheit, MeasureUnit.Celsius, fahrenheitValue
        );
        // 131 °F == 55 °C
        Assert.assertTrue(expectedValue == actualValue);
    }

    @Test
    public void shouldConvertFromXToX() throws ConversionException {
        double celsiusValue = 15;
        double expecetedValue = 15;
        double actualValue = new TemperatureConverter().convertValue(
                MeasureUnit.Celsius, MeasureUnit.Celsius, celsiusValue
        );

        // 15 °C == 15 °C
        Assert.assertTrue(expecetedValue == actualValue);
    }

    
}
