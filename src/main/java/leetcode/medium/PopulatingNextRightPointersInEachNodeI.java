package leetcode.medium;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 116. Populating Next Right Pointers in Each Node (https://leetcode.com/problems/populating-next-right-pointers-in-each-node/)
 */
public class PopulatingNextRightPointersInEachNodeI {

    private static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode next;

        public TreeNode() {}

        public TreeNode(int _val) {
            val = _val;
        }

        public TreeNode(int _val, TreeNode _left, TreeNode _right, TreeNode _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    // Uses a queue. Runs in O(N) time and O(N) space
    public TreeNode connect(TreeNode root) {
        if (root == null)
            return null;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level = 0;

        while (!q.isEmpty()) {
            TreeNode cur = q.poll();
            if (cur.left != null)
                q.add(cur.left);
            if (cur.right != null)
                q.add(cur.right);
            for (int i = 0; i < Math.pow(2, level) - 1; i++) {
                TreeNode node = q.poll();
                cur.next = node;
                cur = node;
                if (node.left != null)
                    q.add(node.left);
                if (node.right != null)
                    q.add(node.right);
            }
            level++;
        }
        return root;
    }

    // runs in O(n) time and without using queue. Stack space is applicable though
    public TreeNode connectOptimised(TreeNode root) {
        if (root == null)
            return null;

        connectRecurse(root);
        return root;
    }

    private void connectRecurse(TreeNode node) {
        if (node == null)
            return;

        if (node.left != null)
            node.left.next = node.right;

        if (node.right != null && node.next != null)
            node.right.next = node.next.left;

        connectRecurse(node.left);
        connectRecurse(node.right);
    }
}
