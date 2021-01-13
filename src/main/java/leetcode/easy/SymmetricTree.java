package leetcode.easy;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 101. Symmetric Tree (https://leetcode.com/problems/symmetric-tree/)
 */
public class SymmetricTree {

    public boolean isSymmetricRecursive(TreeNode root) {
        if (root == null)
            return true;
        return isSymmetricRecursive(root.left, root.right);
    }

    private boolean isSymmetricRecursive(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null)
            return true;

        if (node1 == null || node2 == null)
            return false;

        return (node1.val == node2.val) && isSymmetricRecursive(node1.left, node2.right) && isSymmetricRecursive(node1.right, node2.left);
    }

    public boolean isSymmetricIterative(TreeNode root) {
        if (root == null)
            return true;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root.left);
        q.add(root.right);

        while (!q.isEmpty()) {
            TreeNode node1 = q.poll();
            TreeNode node2 = q.poll();

            if (node1 == null && node2 == null)
                continue;

            if (node1 == null || node2 == null)
                return false;

            if (node1.val != node2.val)
                return false;

            q.add(node1.left);
            q.add(node2.right);
            q.add(node1.right);
            q.add(node2.left);

        }
        return true;
    }
}
