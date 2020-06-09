package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VeryBasicCalculatorTest {

    @Test
    void testCalculate1() {
        assertEquals(2, VeryBasicCalculator.calculate("1 + 1"));
    }

    @Test
    void testCalculate2() {
        assertEquals(0, VeryBasicCalculator.calculate("1 + 1 - 1 - 1"));
    }
}