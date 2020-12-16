package leetcode.easy;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 897. Increasing Order Search Tree (https://leetcode.com/problems/increasing-order-search-tree/)
 */
public class IncreasingOrderSearchTree {

    TreeNode cur;

    // Doesn't use the extra list
    public TreeNode increasingBSTOptimised(TreeNode root) {
        TreeNode ans = new TreeNode(0);
        cur = ans;
        inorder(root);
        return ans.right;
    }

    private void inorder(TreeNode root) {
        if (root == null)
            return;
        inorder(root.left);
        root.left = null;
        cur.right = root;
        cur = root;
        inorder(root.right);
    }

    // O(N) space and O(N) time
    public static TreeNode increasingBST(TreeNode root) {
        if (root == null)
            return null;
        Queue<Integer> queue = new LinkedList<>();
        inorderTraverse(queue, root);

        TreeNode newRoot = null;
        TreeNode cur = null;
        while(!queue.isEmpty()) {
            TreeNode node = new TreeNode(queue.poll());
            if (newRoot == null) {
                newRoot = node;
                cur = node;
            } else {
                cur.right = node;
                cur = cur.right;
            }
        }
        return newRoot;
    }

    private static void inorderTraverse(Queue<Integer> queue, TreeNode root) {
        if (root == null)
            return;
        inorderTraverse(queue, root.left);
        queue.add(root.val);
        inorderTraverse(queue, root.right);
    }
}
