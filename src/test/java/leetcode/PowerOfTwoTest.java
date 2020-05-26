package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PowerOfTwoTest {

    @Test
    void testPowerOfTwoWhenNumIsNegative() {
        Assertions.assertFalse(PowerOfTwo.isPowerOfTwo(-2));
    }

    @Test
    void testPowerOfTwoWhenNumIsZero() {
        Assertions.assertFalse(PowerOfTwo.isPowerOfTwo(0));
    }

    @Test
    void testPowerOfTwoWhenNumIsOne() {
        Assertions.assertTrue(PowerOfTwo.isPowerOfTwo(1));
    }

    @Test
    void testPowerOfTwoWhenNumIs4() {
        Assertions.assertTrue(PowerOfTwo.isPowerOfTwo(4));
    }

    @Test
    void testPowerOfTwoWhenNumIs24() {
        Assertions.assertFalse(PowerOfTwo.isPowerOfTwo(24));
    }

}