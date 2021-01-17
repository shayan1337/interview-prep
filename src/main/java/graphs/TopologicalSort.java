package graphs;

import java.util.*;

// Given a DAG, a topological sort is a linear ordering of nodes such that for every directed edge (u,v), vertex u comes before u in the ordering
public class TopologicalSort {

    public List<GraphNode> sortTopologically(Map<GraphNode, List<GraphNode>> dependencyMap, List<GraphNode> allNodes) {
        Set<GraphNode> visited = new HashSet<>();
        Stack<GraphNode> stack = new Stack<>();

        for(GraphNode graphNode : allNodes) {
            if (!visited.contains(graphNode))
                sortTopologicallyUtil(graphNode, dependencyMap, stack, visited);
        }

        List<GraphNode> topologicallySortedNodes = new ArrayList<>(stack.size());

        while(!stack.isEmpty())
            topologicallySortedNodes.add(stack.pop());

        return topologicallySortedNodes;
    }

    private void sortTopologicallyUtil(GraphNode graphNode, Map<GraphNode, List<GraphNode>> dependencyMap, Stack<GraphNode> stack, Set<GraphNode> visited) {
        if (visited.contains(graphNode))
            return;

        visited.add(graphNode);

        for(GraphNode neighbor : dependencyMap.getOrDefault(graphNode, new ArrayList<>()))
            sortTopologicallyUtil(neighbor, dependencyMap, stack, visited);

        stack.push(graphNode);
    }
}
