package leetcode.easy;

/**
 * 268. Missing Number (https://leetcode.com/problems/missing-number/)
 */
public class MissingNumber {
    public static int missingNumber(int[] nums) {
        boolean[] isPresent = new boolean[nums.length + 1];

        for(int n:nums) {
            isPresent[n] = true;
        }

        for(int i=0; i<isPresent.length; i++) {
            if (!isPresent[i])
                return i;
        }

        return -1;
    }

    /**
     * The other way of finding the missing number using AP
     * @param nums int[]
     * @return int
     */
    public int missingNumberAP(int[] nums) {
        int expectedSum = (nums.length*(nums.length+1))/2;
        int actualSum = 0;

        for(int n:nums) {
            actualSum += n;
        }

        return expectedSum - actualSum;
    }
}
