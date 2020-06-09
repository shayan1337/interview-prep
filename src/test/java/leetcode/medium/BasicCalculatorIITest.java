package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicCalculatorIITest {

    @Test
    void testCalculate1() {
        assertEquals(7, BasicCalculatorII.calculate("3+2*2"));
    }

    @Test
    void testCalculate2() {
        assertEquals(1, BasicCalculatorII.calculate(" 3/2 "));
    }

    @Test
    void testCalculate3() {
        assertEquals(5, BasicCalculatorII.calculate(" 3+5 / 2 "));
    }
}