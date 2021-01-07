package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 545. Boundary of Binary Tree (https://leetcode.com/problems/boundary-of-binary-tree/)
 */
public class BoundaryOfBinaryTree {

    /*
    traverse the left boundary, traverse the right boundary, traverse the leafs. make sure not
    to traverse leafs while traversing the left and right boundaries otherwise there will be dups
     */
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        if (root == null)
            return new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        list.add(root.val);

        traverseLeftBoundary(root.left, list);
        getLeafs(root.left, list);
        getLeafs(root.right, list);
        traverseRightBoundary(root.right, list);

        return list;
    }

    private void traverseLeftBoundary(TreeNode root, List<Integer> list) {
        if (root == null)
            return;

        if (root.left != null || root.right != null)
            list.add(root.val);

        if (root.left != null)
            traverseLeftBoundary(root.left, list);
        else
            traverseLeftBoundary(root.right, list);
    }

    private void getLeafs(TreeNode root, List<Integer> list) {
        if (root == null)
            return;

        getLeafs(root.left, list);
        if (root.left == null && root.right == null)
            list.add(root.val);
        getLeafs(root.right, list);
    }

    private void traverseRightBoundary(TreeNode root, List<Integer> list) {
        if (root == null)
            return;

        if (root.right != null)
            traverseRightBoundary(root.right, list);
        else
            traverseRightBoundary(root.left, list);

        if (root.left != null || root.right != null)
            list.add(root.val);
    }
}
