package leetcode.medium;

/**
 * 11. Container With Most Water (https://leetcode.com/problems/container-with-most-water/)
 */
public class ContainerWithMostWater {

    /**
     * simple solution runs in O(N*N) time and O(1) space
     * Explanation : starting from left calculate water contained with every bar to the right and compare with max. update max when present container exceeds max
     *
     * @param height is the heights of the bars
     * @return maximum amount of water than can be contained
     */
    public static int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < height.length - 1; i++) {
            int j = i + 1;

            while (j < height.length) {

                int water = Math.min(height[i], height[j]) * (j - i);

                if (water > max)
                    max = water;

                j++;
            }
        }
        return max;
    }

    /**
     * O(N) solution using two pointers
     *
     * @param height is the heights of the bars
     * @return maximum amount of water than can be contained
     */
    public static int maxAreaFast(int[] height) {
        int max = Integer.MIN_VALUE;

        int start = 0;
        int end = height.length - 1;

        while (start < end) {
            int water = Math.min(height[start], height[end]) * (end - start);

            if (water > max)
                max = water;

            if (height[start] < height[end])
                start++;
            else if (height[start] > height[end])
                end--;
            else {
                if (height[start + 1] > height[end - 1])
                    start++;
                else end--;
            }
        }
        return max;
    }
}
