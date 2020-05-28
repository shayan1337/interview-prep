package leetcode.easy;

/**
 * 112. Path Sum -> (https://leetcode.com/problems/path-sum/)
 */

public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;
        return hasPathSum(root, sum, 0);
    }

    public boolean hasPathSum(TreeNode root, int sum, int currentSum) {
        if (root.left == null && root.right == null)
            return (currentSum + root.val) == sum;

        boolean hasLeftPath = false;

        if(root.left != null) {
            hasLeftPath = hasPathSum(root.left, sum, currentSum + root.val);
        }

        boolean hasRightPath = false;

        if(root.right != null) {
            hasRightPath = hasPathSum(root.right, sum, currentSum + root.val);
        }

        return hasLeftPath || hasRightPath;
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}