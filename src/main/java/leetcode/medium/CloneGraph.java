package leetcode.medium;

import java.util.*;

/**
 * 133. Clone Graph (https://leetcode.com/problems/clone-graph/)
 */
public class CloneGraph {

    public GraphNode cloneGraph(GraphNode graphNode) {
        if (graphNode == null)
            return null;

        HashMap<GraphNode, GraphNode> visited = new HashMap<>();

        LinkedList<GraphNode> queue = new LinkedList<>();

        queue.add(graphNode);
        visited.put(graphNode, new GraphNode(graphNode.val, new ArrayList()));

        while (!queue.isEmpty()) {
            GraphNode n = queue.remove();
            for (GraphNode neighbor: n.neighbors) {

                if (!visited.containsKey(neighbor)) {
                    visited.put(neighbor, new GraphNode(neighbor.val, new ArrayList()));
                    queue.add(neighbor);
                }
                visited.get(n).neighbors.add(visited.get(neighbor));
            }
        }

        return visited.get(graphNode);
    }
}

class GraphNode {
    public int val;
    public List<GraphNode> neighbors;

    public GraphNode() {}

    public GraphNode(int _val, List<GraphNode> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
