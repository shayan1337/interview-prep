package leetcode.medium;


import java.util.Arrays;
import java.util.Comparator;

/**
 * Leetcode Premium
 * 406. Queue Reconstruction by Height (https://leetcode.com/problems/queue-reconstruction-by-height/)
 */
public class QueueReconstructionByHeight {

    public int[][] reconstructQueue(int[][] people) {
        if (people == null || people.length == 0)
            return new int[][]{};

        Arrays.sort(people, Comparator.comparingInt((int[] o) -> o[0]).thenComparingInt(o -> o[1]));

        return sort(people);
    }

    private int[][] sort(int[][] people) {
        int[][] res = new int[people.length][people[0].length];
        boolean[] filled = new boolean[res.length];

        for (int[] person : people) {
            int h = person[0];
            int k = person[1];

            int index = 0;
            int k1 = 0;

            while (index < res.length && k1 < k) {

                if (!filled[index] || res[index][0] >= h) {
                    k1++;
                }
                index++;
            }

            while (filled[index])
                index++;

            res[index][0] = h;
            res[index][1] = k;
            filled[index] = true;
        }
        return res;
    }
}
