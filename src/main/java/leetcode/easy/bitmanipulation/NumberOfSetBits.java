package leetcode.easy.bitmanipulation;

/**
 * 191. Number of 1 Bits (https://leetcode.com/problems/number-of-1-bits/)
 */
public class NumberOfSetBits {
    public static int hammingWeight(int n) {
        int mask = 1;
        int setBits = 0;
        for(int i = 0; i<32; i++) {
            if ((n & mask) != 0)
                setBits++;
            mask <<= 1;
        }
        return setBits;
    }
}
