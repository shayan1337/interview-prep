package leetcode.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * 1522. Diameter of N-Ary Tree (https://leetcode.com/problems/diameter-of-n-ary-tree/)
 */
public class DiameterOfNAryTree {

    int ans = 0;

    public int diameter(Node root) {
        dfs(root);
        return ans;
    }

    private int dfs(Node root) {
        if (root == null)
            return 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        pq.add(0);
        pq.add(0);

        for (Node child : root.children) {
            pq.add(dfs(child));
        }

        int h1 = pq.poll();
        int h2 = pq.poll();

        ans = Math.max(ans, h1 + h2);

        return h1 + 1;
    }
}


class Node {
    public int val;
    public List<Node> children;

    public Node() {
        children = new ArrayList<>();
    }

    public Node(int _val) {
        val = _val;
        children = new ArrayList<>();
    }

    public Node(int _val, ArrayList<Node> _children) {
        val = _val;
        children = _children;
    }
};