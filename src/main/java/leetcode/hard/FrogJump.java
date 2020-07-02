package leetcode.hard;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 403. Frog Jump (https://leetcode.com/problems/frog-jump/)
 */
public class FrogJump {

    /**
     * Runs in O(N*N) time and uses O(N*N) space (DP solution)
     */
    public static boolean canCross(int[] stones) {
        if (stones == null || stones.length == 0)
            return false;

        Map<Integer, Set<Integer>> map = new HashMap<>();

        for (int i = 0; i < stones.length; i++) {
            map.put(stones[i], new HashSet<Integer>());
        }

        map.get(0).add(0);

        int lastStone = stones[stones.length - 1];

        for (int i = 0; i < stones.length; i++) {
            for (int k : map.get(stones[i])) {
                for (int step = k - 1; step <= k + 1; step++) {
                    if (step > 0 && map.containsKey(stones[i] + step)) {
                        map.get(stones[i] + step).add(step);
                    }
                }
            }
        }
        return map.get(stones[stones.length - 1]).size() > 0;
    }
}
