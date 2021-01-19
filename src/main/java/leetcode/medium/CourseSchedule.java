package leetcode.medium;

import java.util.*;

/**
 * 207. Course Schedule (https://leetcode.com/problems/course-schedule/)
 */
public class CourseSchedule {

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        Map<Integer, List<Integer>> dependencies = new HashMap<>();

        for(int[] arr : prerequisites) {
            if (!dependencies.containsKey(arr[0]))
                dependencies.put(arr[0], new ArrayList<>());
            dependencies.get(arr[0]).add(arr[1]);
        }

        return !isCyclic(dependencies, numCourses);
    }

    private boolean isCyclic(Map<Integer, List<Integer>> dependencies, int n) {
        HashSet<Integer> visited = new HashSet<>();

        for(int i = 0; i < n; i++) {
            if (isCyclicUtil(i, dependencies, visited, new HashSet<>()))
                return true;
        }

        return false;
    }

    private boolean isCyclicUtil(int i, Map<Integer, List<Integer>> dep, Set<Integer> visited, Set<Integer> nodesVisitedOnCurrentTraversal) {
        if (nodesVisitedOnCurrentTraversal.contains(i))
            return true;

        if (visited.contains(i))
            return false;

        nodesVisitedOnCurrentTraversal.add(i);
        visited.add(i);

        for(int n : dep.getOrDefault(i, new ArrayList<>())) {
            if (isCyclicUtil(n, dep, visited, nodesVisitedOnCurrentTraversal))
                return true;
        }

        nodesVisitedOnCurrentTraversal.remove(i);
        return false;
    }
}
