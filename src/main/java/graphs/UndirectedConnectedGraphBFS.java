package graphs;

import java.util.*;

// BFS of an undirected and connected graph given a reference to a single graph node
public class UndirectedConnectedGraphBFS {

    public List<GraphNode> BFS(GraphNode graphNode) {
        List<GraphNode> allNodes = new ArrayList<>();

        Queue<GraphNode> queue = new LinkedList<>();
        Set<GraphNode> visited = new HashSet<>();

        allNodes.add(graphNode);
        queue.add(graphNode);
        visited.add(graphNode);

        while(!queue.isEmpty()) {
            GraphNode graphNode1 = queue.poll();
            List<GraphNode> neighbours = graphNode1.neighbours;

            for(GraphNode neighbour : neighbours) {
                if (!visited.contains(neighbour)) {
                    allNodes.add(neighbour);
                    queue.add(neighbour);
                    visited.add(neighbour);
                }
            }
        }
        return allNodes;
    }
}
