package leetcode.medium;

import java.util.*;

/**
 * Premium
 * 15. 3Sum (https://leetcode.com/problems/3sum/)
 */
public class ThreeSum {

    /**
     * Sort the array in ascending order and then follow the 2 pointer approach
     * @param nums is the input array
     * @return list of list of integers
     */
    public static List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length == 0)
            return new ArrayList<>();

        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i]))
                continue;
            set.add(nums[i]);

            int target = -nums[i];
            List<Integer> list = new ArrayList<>();

            int start = i + 1;
            int end = nums.length - 1;

            while (start < end) {
                int sum = nums[start] + nums[end];

                if (sum == target) {
                    list.addAll(Arrays.asList(nums[i], nums[start], nums[end]));
                    res.add(new ArrayList<>(list));
                    list.clear();
                    while (start + 1 < nums.length && nums[start] == nums[start + 1])
                        start++;
                    start++;
                    while (end - 1 >= 0 && nums[end] == nums[end - 1])
                        end--;
                    end--;
                } else if (sum < target) {
                    start++;
                } else
                    end--;
            }
        }
        return res;
    }
}
