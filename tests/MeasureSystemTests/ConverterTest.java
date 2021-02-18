package MeasureSystemTests;

import com.githubcolomboDavide7.MeasureSystem.*;
import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void shouldConvertCelsiusToFahrenheit() throws ConversionException {
        IConverter tempConverter = new TemperatureConverter(MeasureUnit.Celsius, MeasureUnit.Fahrenheit);
        double farhenheitValue = tempConverter.convertValue(6);
        Assert.assertTrue(farhenheitValue == 42.80);
    }

    @Test
    public void shouldConvertFromFahrenheitToCelsius() throws ConversionException {
        IConverter tempConverter = new TemperatureConverter(MeasureUnit.Fahrenheit, MeasureUnit.Celsius);
        double celsiusValue = tempConverter.convertValue(77);
        Assert.assertTrue(celsiusValue == 25);
    }

    @Test (expected = ConversionException.class)
    public void shouldThrowConversionException() throws ConversionException{
        IConverter tempConverter = new TemperatureConverter(MeasureUnit.Celsius, MeasureUnit.Pascal);
        tempConverter.convertValue(10);
        Assert.assertTrue(false);
    }

}