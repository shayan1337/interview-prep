package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerOf2Test {

    @Test
    void testFor2() {
        assertTrue(PowerOf2.isPowerOfTwo(2));
    }

    @Test
    void testFor3() {
        assertFalse(PowerOf2.isPowerOfTwo(3));
    }
}