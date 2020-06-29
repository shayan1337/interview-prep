package leetcode.medium;

import java.util.*;

/**
 * 787. Cheapest Flights Within K Stops (https://leetcode.com/problems/cheapest-flights-within-k-stops/)
 */
public class CheapestFlights {

    // TODO use DIIJKSTRA's
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        HashMap<Integer, List<Trip>> map = new HashMap<>();

        for(int[] flight : flights) {
            Trip trip = new Trip(flight[0], flight[1], flight[2]);
            map.put(flight[0], map.getOrDefault(flight[0], new ArrayList<Trip>()));
            map.get(flight[0]).add(trip);
        }

        Set<Integer> visited = new HashSet<>();
        long res = getCost(map, src, dst, K, visited);
        return res == Integer.MAX_VALUE ? -1 : (int)res;
    }

    private long getCost(Map<Integer, List<Trip>> map, int cur, int dest, int K, Set<Integer> set) {
        if (cur == dest)
            return 0;

        if (K < 0 || set.contains(cur))
            return Integer.MAX_VALUE;

        long ans = Integer.MAX_VALUE;

        set.add(cur);

        for(Trip t : map.getOrDefault(cur, new ArrayList<>())) {
            ans = Math.min(ans, getCost(map, t.dest, dest, K-1, set) + t.price);
        }

        set.remove(cur);
        return ans;
    }
}


class Trip {
    int src;
    int dest;
    int price;

    Trip(int s, int d, int p) {
        src = s;
        dest = d;
        price = p;
    }
}
