package leetcode.medium;

import java.util.*;

/**
 * 323. Number of Connected Components in an Undirected Graph (https://leetcode.com/problems/number-of-connected-components-in-an-undirected-graph/)
 */
public class ConnectedComponentsInDirectedGraph {

    public int countComponents(int n, int[][] edges) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        for(int[] edge : edges) {
            if (!map.containsKey(edge[0]))
                map.put(edge[0], new ArrayList<>());
            if (!map.containsKey(edge[1]))
                map.put(edge[1], new ArrayList<>());

            map.get(edge[0]).add(edge[1]);
            map.get(edge[1]).add(edge[0]);
        }

        Set<Integer> visited = new HashSet<>();
        int res = 0;

        for(int i = 0; i < n; i++) {
            if (!visited.contains(i)) {
                res++;
                dfs(i, map, visited);
            }
        }
        return res;
    }

    private void dfs(int current, Map<Integer, List<Integer>> map, Set<Integer> visited) {
        if (visited.contains(current))
            return;

        visited.add(current);

        for(int neighbour : map.getOrDefault(current, new ArrayList<>()))
            dfs(neighbour, map, visited);
    }
}
