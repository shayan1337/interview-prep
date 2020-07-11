package leetcode.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 94. Binary Tree Inorder Traversal (https://leetcode.com/problems/binary-tree-inorder-traversal/)
 */
public class BinaryTreeInorderTraversal {

    // recursive solution
    public List<Integer> inorderTraversalRecursive(TreeNode root) {
        List<Integer> nodes = new ArrayList<>();

        inorderTraversalRecursive(root, nodes);
        return nodes;
    }

    private void inorderTraversalRecursive(TreeNode root, List<Integer> nodes) {
        if (root == null)
            return;

        inorderTraversalRecursive(root.left, nodes);
        nodes.add(root.val);
        inorderTraversalRecursive(root.right, nodes);
    }

    // iterative solution
    public List<Integer> inorderTraversalIterative(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> nodes = new ArrayList<>();

        while(root != null || !stack.isEmpty()) {

            while(root != null) {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            nodes.add(root.val);
            root = root.right;
        }

        return nodes;
    }
}
