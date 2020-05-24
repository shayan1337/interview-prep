package arrays.sort;

/**
 * Mergesort -> sort array in increasing order. Runtime - O(N*logN), Space - O(N)
 * https://www.youtube.com/watch?v=TzeBrDU-JaY
 */

public class MergeSort {
    public static void sort(int[] nums) {
        if (nums == null || nums.length == 0)
            return;
        mergeSort(nums);
    }

    private static void mergeSort(int[] nums) {
        if (nums.length < 2)
            return;


        int mid = nums.length/2;
        int[] left = slice(0, mid - 1, nums);
        int[] right = slice(mid, nums.length-1, nums);

        mergeSort(left);
        mergeSort(right);
        merge(left, right, nums);
    }

    private static int[] slice(int start, int end, int[] nums) {
        int[] array = new int[(end - start) + 1];
        int index = 0;

        for(int i = start; i <= end; i++) {
            array[index++] = nums[i];
        }
        return array;
    }

    private static void merge(int[] left, int[] right, int[] nums) {
        int indexLeft = 0;
        int indexRight = 0;
        int indexNums = 0;

        while(indexLeft < left.length && indexRight < right.length) {
            if (left[indexLeft] < right[indexRight]) {
                nums[indexNums] = left[indexLeft];
                indexLeft++;
            }
            else {
                nums[indexNums] = right[indexRight];
                indexRight++;
            }
            indexNums++;
        }

        while(indexLeft < left.length) {
            nums[indexNums] = left[indexLeft];
            indexLeft++;
            indexNums++;
        }

        while(indexRight < right.length) {
            nums[indexNums] = right[indexRight];
            indexRight++;
            indexNums++;
        }
    }
}
