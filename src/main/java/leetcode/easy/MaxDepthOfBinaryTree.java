package leetcode.easy;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 104. Maximum Depth of Binary Tree (https://leetcode.com/problems/maximum-depth-of-binary-tree/)
 */
public class MaxDepthOfBinaryTree {

    // DFS using recursion (short and sweet)
    public static int maxDepth(TreeNode root) {
        if (root == null)
            return 0;

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    // if you dont wanna use recursion (BFS approach)

    public static int maxDepthUsingBFS(TreeNode root) {
        if (root == null)
            return 0;

        int heightOfTree = 1;

        Queue<TreeNodeWithHeight> queue = new LinkedList<>();
        queue.add(new TreeNodeWithHeight(root, 1));

        while (!queue.isEmpty()) {
            TreeNodeWithHeight treeNodeWithHeight = queue.poll();
            heightOfTree = treeNodeWithHeight.height;
            if (treeNodeWithHeight.node.left != null)
                queue.add(new TreeNodeWithHeight(treeNodeWithHeight.node.left, treeNodeWithHeight.height + 1));
            if (treeNodeWithHeight.node.right != null)
                queue.add(new TreeNodeWithHeight(treeNodeWithHeight.node.right, treeNodeWithHeight.height + 1));
        }
        return heightOfTree;
    }

    static class TreeNodeWithHeight {
        TreeNode node;
        int height;

        private TreeNodeWithHeight(TreeNode node, int height) {
            this.node = node;
            this.height = height;
        }
    }
}
