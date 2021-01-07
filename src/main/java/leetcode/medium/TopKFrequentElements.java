package leetcode.medium;

import java.util.*;

/**
 * 347. Top K Frequent Elements (https://leetcode.com/problems/top-k-frequent-elements/)
 */
public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        // min heap of size k
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(map::get));

        for(int elem : map.keySet()) {
            pq.add(elem);

            if(pq.size() > k)
                pq.poll();
        }

        int[] res = new int[k];
        Iterator<Integer> it = pq.iterator();
        int i = 0;
        while(i < k) {
            res[i] = it.next();
            i++;
        }
        return res;
    }
}
