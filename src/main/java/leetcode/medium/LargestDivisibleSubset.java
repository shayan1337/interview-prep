package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Premium
 * 368. Largest Divisible Subset (https://leetcode.com/problems/largest-divisible-subset/)
 */
public class LargestDivisibleSubset {

    public static List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> all = new ArrayList<>();

        for (int num : nums)
            all.add(new ArrayList<>());

        for (int i = 0; i < nums.length; i++) {
            List<Integer> max = new ArrayList<>();

            for(int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && all.get(j).size() > max.size())
                    max = all.get(j);
            }

            all.get(i).addAll(max);
            all.get(i).add(nums[i]);
        }

        List<Integer> res = new ArrayList<>();

        for(List<Integer> l : all) {
            if (l.size() > res.size())
                res = l;
        }
        return res;
    }
}
