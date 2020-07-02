package leetcode.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FrogJumpTest {

    @Test
    void testCanCross_1() {
        assertTrue(FrogJump.canCross(new int[]{0, 1, 3, 5, 6, 8, 12, 17}));
    }

    @Test
    void testCanCross_2() {
        assertFalse(FrogJump.canCross(new int[]{0, 1, 2, 3, 4, 8, 9, 11}));
    }

    @Test
    void testCanCross_3() {
        assertFalse(FrogJump.canCross(new int[]{0, 2}));
    }
}