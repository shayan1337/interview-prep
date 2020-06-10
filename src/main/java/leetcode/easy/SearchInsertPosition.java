package leetcode.easy;

/**
 * 35. Search Insert Position (https://leetcode.com/problems/search-insert-position/)
 */
public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] == target)
                return mid;

            else if (nums[mid] > target) {
                if (mid == 0 || nums[mid - 1] < target)
                    return mid;
                end = mid - 1;
            } else {
                if (mid == nums.length - 1)
                    return mid + 1;
                start = mid + 1;
            }
        }

        return -1;
    }
}
