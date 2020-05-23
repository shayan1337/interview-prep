package arrays.search;

// Binary search that works on ascending arrays only and assumes no duplicated
public class BinarySearchAscending {

    public static int search(int[] nums, int num) {

        if (nums == null || nums.length == 0)
            return -1;

        int low = 0;
        int high = nums.length - 1;

        while(low <= high) {

            int mid = (low + high)/2;

            if (nums[mid] == num)
                return mid;

            if (nums[mid] > num) {
                high = mid - 1;
            } else
                low = mid + 1;

        }
        return -1;
    }
}
