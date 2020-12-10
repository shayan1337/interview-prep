package leetcode.easy.bitmanipulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseBitsTest {

    @Test
    void testReverseBits() {
        long res = ReverseBits.reverseBits(43);
        Assertions.assertEquals(-738197504, res);
    }
}