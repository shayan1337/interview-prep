package leetcode.medium;


import java.util.Arrays;

/**
 * 322. Coin Change (https://leetcode.com/problems/coin-change/)
 */
public class CoinChange {

    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for(int coin : coins) {
            for(int amt = coin; amt < amount + 1; amt++) {
                dp[amt] = Math.min(dp[amt], dp[amt - coin] + 1);
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }
}
