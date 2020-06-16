package leetcode.medium;

import java.util.Arrays;

/**
 * 16. 3Sum Closest (https://leetcode.com/problems/3sum-closest/)
 */
public class ThreeSumClosest {

    public static int threeSumClosest(int[] nums, int K) {
        Arrays.sort(nums);

        int minDiff = Integer.MAX_VALUE;
        int res = 0;

        for (int i = 0; i < nums.length; i++) {

            int target = K - nums[i];

            int start = i + 1;
            int end = nums.length - 1;

            while (start < end) {
                int sum = nums[start] + nums[end];

                if (Math.abs(target - sum) < minDiff) {
                    minDiff = Math.abs(target - sum);
                    res = nums[i] + sum;
                }

                if (sum < target)
                    start++;
                else
                    end--;
            }
        }
        return res;

    }
}
