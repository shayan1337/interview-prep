package leetcode.easy.bitmanipulation;

/**
 * 190. Reverse Bits
 */
public class ReverseBits {

    // Note that this times out for (11111111111111111111111111111101). Dont know why
    public static int reverseBits(int n) {
        int res = 0;
        int power = 31;
        while (n != 0) {
            res = res | ( (n & 1) << power );
            n = n >> 1;
            power -= 1;
        }
        return res;
    }
}
