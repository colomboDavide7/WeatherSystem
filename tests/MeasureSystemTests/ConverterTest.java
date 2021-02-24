package MeasureSystemTests;

import com.githubcolomboDavide7.MeasureSystem.*;
import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test (expected = Exception.class)
    public void shouldThrowExceptionIfNotCombatibleUnits() throws Exception {
        MeasureUnit fromUnit = MeasureUnit.Celsius;
        MeasureUnit toUnit   = MeasureUnit.mmHg;
        double value = Converter.convertValue(fromUnit, toUnit, 0);
    }

    @Test
    public void shouldConvertValueFromCelsiusToFahrenheit(){
        try {
            MeasureUnit fromUnit = MeasureUnit.Celsius;
            MeasureUnit toUnit   = MeasureUnit.Fahrenheit;
            double expectedValue = 32;
            double actualValue = Converter.convertValue(fromUnit, toUnit, 0);
            Assert.assertTrue(expectedValue == actualValue);
        } catch(Exception e) {
            Assert.assertTrue(false);
        }
    }

}
