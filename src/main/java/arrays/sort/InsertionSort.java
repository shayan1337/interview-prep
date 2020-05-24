package arrays.sort;

/**
 * Insertion sort -> sorts array into ascending order. In place, O(N*N)
 * https://www.youtube.com/watch?v=i-SKeOcBwko&t=408s
 */

public class InsertionSort {

    public static void sort(int[] nums) {
        if (nums == null || nums.length == 0)
            return;


        for(int i=0; i<nums.length; i++) {

            int j=i;

            while(j > 0 && nums[j] < nums[j-1]) {
                int temp = nums[j];
                nums[j] = nums[j-1];
                nums[j-1] = temp;
                j--;
            }
        }
    }
}
