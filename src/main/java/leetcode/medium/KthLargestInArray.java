package leetcode.medium;

import java.util.PriorityQueue;

/**
 * 215. Kth Largest Element in an Array (https://leetcode.com/problems/kth-largest-element-in-an-array/)
 */
public class KthLargestInArray {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int n:nums) {
            pq.add(n);

            if (pq.size() > k)
                pq.poll();
        }
        return pq.peek();
    }
}
