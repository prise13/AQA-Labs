package aqa_tests;

import day_1.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AddClassTest {

    @DataProvider
    public static Object[][] addTestProvider() {
        Object[][] provider = new Object[1][3];
        provider[0][0] = 1;
        provider[0][1] = 2;
        provider[0][2] = 3;
        return provider;
    }

    @Test(dataProvider = "addTestProvider")
    void addTest(Integer a, Integer b, Integer expectedResult) {
        Assert.assertEquals(Calculator.add(a,b), expectedResult.intValue(), "Invalid result!");
    }
}
