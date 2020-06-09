package leetcode.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicCalculatorTest {

    @Test
    void testCalculate() {
        assertEquals(2, BasicCalculator.calculate("1 + 1"));
    }

    @Test
    void testCalculate1() {
        assertEquals(3, BasicCalculator.calculate(" 2-1 + 2 "));
    }

    @Test
    void testCalculate2() {
        assertEquals(23, BasicCalculator.calculate("(1+(4+5+2)-3)+(6+8)"));
    }
}