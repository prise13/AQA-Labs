package aqa_tests;

import day_1.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MinusCalcTest {
    @Test
    void minusTest() {
        Assert.assertEquals(Calculator.minus(3,2), 1, "Invalid result");
    }
}
