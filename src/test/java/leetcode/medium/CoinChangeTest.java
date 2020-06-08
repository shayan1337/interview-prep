package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinChangeTest {

    @Test
    void testCoinChange3() {
        int res = CoinChange.coinChange(new int[]{2}, 3);
        assertEquals(-1, res);
    }

    @Test
    void testCoinChange11() {
        int res = CoinChange.coinChange(new int[]{1, 2, 5}, 11);
        assertEquals(3, res);
    }

}