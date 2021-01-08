package leetcode.medium;

/**
 * 543. Diameter of Binary Tree (https://leetcode.com/problems/diameter-of-binary-tree/)
 */
public class DiameterOfBinaryTree {

    int ans = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return ans;
    }

    public int dfs(TreeNode root) {
        if (root == null)
            return 0;

        int L = dfs(root.left);
        int R = dfs(root.right);
        int diameter = L + R;
        if (diameter > ans)
            ans = diameter;
        return Math.max(L, R) + 1;
    }
}
