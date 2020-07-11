package leetcode.medium;

import java.util.Stack;

/**
 * 98. Validate Binary Search Tree (https://leetcode.com/problems/validate-binary-search-tree/)
 */
public class ValidateBST {

    /**
     * Iterative inorder solution(doesn't require storing all nodes in inorder form)
     * @param root
     * @return
     */
    public boolean validateBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        double min = -Double.MAX_VALUE;

        while(root != null || !stack.isEmpty()) {

            while(root != null) {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();

            if (root.val <= min)
                return false;

            min = root.val;
            root = root.right;
        }
        return true;
    }
}
