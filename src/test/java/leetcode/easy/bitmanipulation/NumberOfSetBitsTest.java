package leetcode.easy.bitmanipulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumberOfSetBitsTest {

    @Test
    void testHammingWeight() {
        int res = NumberOfSetBits.hammingWeight(-3);
        Assertions.assertEquals(31, res);
    }
}