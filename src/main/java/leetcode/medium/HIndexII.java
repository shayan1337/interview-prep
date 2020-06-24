package leetcode.medium;

/**
 * 275. H-Index II (https://leetcode.com/problems/h-index-ii/)
 */
public class HIndexII {

    /**
     * Uses O(N) time.
     * @param citations is the array of citations of the author
     * @return the h-index of the author
     */
    public static int hIndex(int[] citations) {
        if (citations == null || citations.length == 0)
            return 0;

        int N = citations.length;
        int i = N - 1;

        while (i >= 0 && citations[i] >= N - i)
            i--;

        return i == -1 ? N : N - i - 1;
    }
}
