package graphs;

import java.util.List;

// represents a node in a graph
public class GraphNode {
    int value;
    List<GraphNode> neighbours;

    GraphNode(int _value, List<GraphNode> _neighbours) {
        value = _value;
        neighbours = _neighbours;
    }
}
