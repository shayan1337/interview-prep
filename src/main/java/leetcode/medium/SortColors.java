package leetcode.medium;

/**
 * 75. Sort Colors (https://leetcode.com/problems/sort-colors/)
 */
public class SortColors {

    /* optimised version of solution. Done in a single pass only */
    public static void sortColorsInOnePass(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int current = i;

        while(i <= current && current <= j) {
            while ((nums[current] == 0 || nums[current] == 2) && (current >= i && current <= j)) {

                if (nums[current] == 0) {
                    nums[current] = nums[i];
                    nums[i] = 0;
                    i++;
                } else {
                    nums[current] = nums[j];
                    nums[j] = 2;
                    j--;
                }
            }
            current++;
        }
    }

    /* counting sort*/
    public static void sortColors(int[] nums) {
        int[] count = new int[3];

        for (int n : nums)
            count[n]++;

        int index = 0;
        for (int i = 0; i < 3; i++) {
            while (count[i] > 0) {
                nums[index] = i;
                index++;
                count[i]--;
            }
        }
    }
}
