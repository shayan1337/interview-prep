package arrays.search;


/*
* Binary search that works on both ascending/descending arrays. Assumes no dups
*/

public class BinarySearch {

    public static int search(int[] nums, int num) {
        if (nums == null || nums.length == 0)
            return -1;

        if (nums[0] <= nums[nums.length - 1])
            return search(nums, num, true);
        return search(nums, num, false);
    }

    private static int search(int[] nums, int num, boolean isAscending) {

        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {

            int mid = (start + end)/2;

            if (nums[mid] == num)
                return mid;

            if (isAscending) {
                if (nums[mid] > num) {
                    end = mid - 1;
                } else
                    start = mid + 1;
            } else {
                if (nums[mid] > num) {
                    start = mid + 1;
                } else
                    end = mid - 1;
            }

        }
        return -1;
    }
}
