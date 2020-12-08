package leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaxDepthOfBinaryTreeTest {

    @Test
    public void test1DFS() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);

        int result = MaxDepthOfBinaryTree.maxDepth(root);

        Assertions.assertEquals(3, result);
    }

    @Test
    public void test1BFS() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);

        int result = MaxDepthOfBinaryTree.maxDepthUsingBFS(root);

        Assertions.assertEquals(3, result);
    }

}