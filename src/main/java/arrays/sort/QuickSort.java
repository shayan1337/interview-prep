package arrays.sort;

/**
 * Quicksort -> Ascending order. Inplace. Runtime O(N*logN) avg case, O(N*N) worst case
 */

public class QuickSort {


    public static void sort(int[] nums) {
        if (nums == null || nums.length == 0)
            return;

        quickSort(0, nums.length - 1, nums);
    }

    private static void quickSort(int start, int end, int[] nums) {
        if (start >= end)
            return;

        int partitionIndex = partition(start, end, nums);
        quickSort(start, partitionIndex - 1, nums);
        quickSort(partitionIndex + 1, end, nums);

    }

    private static int partition(int start, int end, int[] nums) {

        int i = start;
        int partitionIndex = start;

        while(i < end) {
            if (nums[i] < nums[end]) {
                int tmp = nums[partitionIndex];
                nums[partitionIndex] = nums[i];
                nums[i] = tmp;
                partitionIndex++;
            }
            i++;
        }

        int tmp = nums[partitionIndex];
        nums[partitionIndex] = nums[end];
        nums[end] = tmp;
        return partitionIndex;
    }
}
