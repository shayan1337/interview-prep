package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {

    @Test
    void testReverse() {
        assertEquals(321, ReverseInteger.reverse(123));
    }

    @Test
    void testReverse1() {
        assertEquals(-321, ReverseInteger.reverse(-123));
    }

    @Test
    void testReverse2() {
        assertEquals(0, ReverseInteger.reverse(1534236469));
    }
}