package leetcode.medium;


/**
 * 518. Coin Change 2 (https://leetcode.com/problems/coin-change-2/)
 */
public class CoinChangeII {

    public static int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;

        for(int coin : coins) {
            for(int amt = coin; amt < amount + 1; amt++) {
                dp[amt] += dp[amt-coin];
            }
        }
        return dp[amount];
    }
}
