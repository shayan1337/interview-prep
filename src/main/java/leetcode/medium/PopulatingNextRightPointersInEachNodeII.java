package leetcode.medium;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 117. Populating Next Right Pointers in Each Node II (https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/)
 */
public class PopulatingNextRightPointersInEachNodeII {
    private static class TreeNode {

        public int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode next;

        public TreeNode(int _val, TreeNode _left, TreeNode _right, TreeNode _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    // using queue
    public TreeNode connect(TreeNode root) {
        if (root == null)
            return null;

        Queue<TreeNode> Q = new LinkedList<>();
        Q.add(root);

        while (!Q.isEmpty()) {
            int size = Q.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = Q.poll();
                if (i < size - 1) {
                    node.next = Q.peek();
                }

                if (node.left != null)
                    Q.add(node.left);

                if (node.right != null)
                    Q.add(node.right);
            }
        }
        return root;
    }

    //
    public TreeNode connectRecursive(TreeNode root) {
        if (root == null) {
            return null;
        }
        // get left most cousin in the tree
        TreeNode leftMostCousin = getNodeNextLeftMost(root.next);
        if (root.left != null && root.right != null) {
            root.left.next = root.right;
            root.right.next = leftMostCousin;
        } else if (root.left != null) {
            root.left.next = leftMostCousin;
        } else if (root.right != null) {
            root.right.next = leftMostCousin;
        }
        // connect first right child and then left
        connect(root.right);
        connect(root.left);

        return root;
    }

    // traverse using next pointers till we get either left or right non null
    private TreeNode getNodeNextLeftMost(TreeNode node) {
        while (node != null && (node.left == null && node.right == null)) {
            node = node.next;
        }
        if (node == null) {
            return null;
        } else {
            return node.left != null ? node.left : node.right;
        }
    }
}
