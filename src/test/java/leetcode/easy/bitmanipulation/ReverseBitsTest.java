package leetcode.easy.bitmanipulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseBitsTest {

    @Test
    void testReverseBits() {
        long res = ReverseBits.reverseBits(-3);
        Assertions.assertEquals(-1073741825, res);
    }
}