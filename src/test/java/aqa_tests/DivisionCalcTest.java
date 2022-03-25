package aqa_tests;

import day_1.Calculator;
import day_2.DivisionByZeroException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class DivisionCalcTest {
    @Parameters({"error-message", "first-value", "second-value", "expected-result"})
    @Test
    void divisionTest(String errorMessage, Integer a, Integer b, Integer expectedResult) throws DivisionByZeroException {
        Assert.assertEquals(Calculator.divide(a,b), expectedResult.intValue(), errorMessage);
    }
}
