package aqa_tests;

import day_1.Calculator;
import day_2.DivisionByZeroException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class DivisionCalcTest {
    @Parameters({"error-message"})
    @Test
    void divisionTest(String errorMessage) throws DivisionByZeroException {
        Assert.assertEquals(Calculator.divide(10,2), 10, errorMessage);
    }
}
