package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HIndexIITest {

    @Test
    void testHIndex_1() {
        assertEquals(3, HIndexII.hIndex(new int[]{0, 1, 3, 5, 6}));
    }

    @Test
    void testHIndex_2() {
        assertEquals(2, HIndexII.hIndex(new int[]{0, 1, 2, 5, 6}));
    }

    @Test
    void testHIndex_3() {
        assertEquals(0, HIndexII.hIndex(new int[]{}));
    }

    @Test
    void testHIndex_4() {
        assertEquals(1, HIndexII.hIndex(new int[]{1}));
    }

}