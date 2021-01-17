package graphs;

import java.util.*;

// DFS of an undirected and connected graph given a reference to a single graph node
public class UndirectedConnectedGraphDFS {

    public List<GraphNode> DFS(GraphNode graphNode) {
        List<GraphNode> allNodes = new ArrayList<>();

        Stack<GraphNode> stack = new Stack<>();
        Set<GraphNode> visited = new HashSet<>();

        allNodes.add(graphNode);
        stack.add(graphNode);
        visited.add(graphNode);

        while(!stack.isEmpty()) {
            GraphNode graphNode1 = stack.pop();
            List<GraphNode> neighbours = graphNode1.neighbours;

            for(GraphNode neighbour : neighbours) {
                if (!visited.contains(neighbour)) {
                    allNodes.add(neighbour);
                    stack.push(neighbour);
                    visited.add(neighbour);
                }
            }
        }
        return allNodes;
    }
}