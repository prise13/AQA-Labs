package aqa_tests;


import day_1.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleClassTest {
    @Test
    void multipleTest() {
        Assert.assertEquals(Calculator.multiple(3,3), 9, "Invalid result");
    }
}
