package leetcode.easy;


/**
 * 226. Invert Binary Tree (https://leetcode.com/problems/invert-binary-tree/)
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;

        TreeNode dup = new TreeNode(root.val);
        dup.left = invertTree(root.right);
        dup.right = invertTree(root.left);
        return dup;
    }
}
