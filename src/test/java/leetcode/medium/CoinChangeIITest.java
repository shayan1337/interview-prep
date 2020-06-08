package leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CoinChangeIITest {

    @Test
    void testChangeCoins() {
        int res = CoinChangeII.change(5, new int[]{1, 2, 5});
        Assertions.assertEquals(4, res);
    }


}