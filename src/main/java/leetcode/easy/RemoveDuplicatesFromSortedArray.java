package leetcode.easy;

/**
 * 26. Remove Duplicates from Sorted Array (https://leetcode.com/problems/remove-duplicates-from-sorted-array/)
 */
public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        if (nums.length == 1)
            return 1;

        int i = 0;
        int j = i + 1;

        while(j < nums.length) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        return i + 1;
    }
}
