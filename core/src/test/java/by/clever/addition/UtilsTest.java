package by.clever.addition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UtilsTest {

    @Test
    public void isAllPositiveNumbersPositive() {
        Assertions.assertTrue(Utils.isAllPositiveNumbers("1", "2", "20", "3"));
        Assertions.assertTrue(Utils.isAllPositiveNumbers("1", "2", "2.1"));
        Assertions.assertTrue(Utils.isAllPositiveNumbers("1.1", "2.3"));
    }

    @Test
    public void isAllPositiveNumbersNegative() {
        Assertions.assertFalse(Utils.isAllPositiveNumbers("asd", "-", ",", ""));
        Assertions.assertFalse(Utils.isAllPositiveNumbers("-1", "-8", "-2"));
        Assertions.assertFalse(Utils.isAllPositiveNumbers("-1.8", "-8.5", "-2.7"));
        Assertions.assertFalse(Utils.isAllPositiveNumbers("dfg", "-5", "-9.4"));
    }
}
