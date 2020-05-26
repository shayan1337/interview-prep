package leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class StocksTest {

    @Test
    void testStockSell1() {
        int res = Stocks.maxProfit(new int[]{7,1,5,3,6,4});
        Assertions.assertEquals(7, res);
    }

    @Test
    void testStockSell2() {
        int res = Stocks.maxProfit(new int[]{1,2,3,4,5});
        Assertions.assertEquals(4, res);
    }

    @Test
    void testStockSell3() {
        int res = Stocks.maxProfit(new int[]{7,6,4,3,1});
        Assertions.assertEquals(0, res);
    }

}