package leetcode;

/**
 * 122. Best Time to Buy and Sell Stock II - (https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/)
 */
public class Stocks {

    public static int maxProfit(int[] prices) {
        int totalProfit = 0;
        int day = 0;

        while (day < prices.length) {
            int j = day + 1;

            if (j < prices.length && prices[j] > prices[day]) {
                while(j < prices.length - 1) {
                    if (prices[j + 1] > prices[j])
                        j++;
                    else
                        break;
                }
                totalProfit += prices[j] - prices[day];
                day = j + 1;
            } else
                day++;
        }

        return totalProfit;
    }
}
