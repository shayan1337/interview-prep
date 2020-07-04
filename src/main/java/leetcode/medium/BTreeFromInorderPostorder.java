package leetcode.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * 106. Construct Binary Tree from Inorder and Postorder Traversal (https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/)
 */
public class BTreeFromInorderPostorder {

    public TreeNode buildTree(int[] inorder, int[] postorder) {

        if (inorder == null || postorder == null || inorder.length == 0 || postorder.length == 0)
            return null;

        Map<Integer, Integer> iMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++)
            iMap.put(inorder[i], i);

        return buildTree(iMap, inorder, postorder, postorder.length - 1, 0, postorder.length - 1);
    }

    private TreeNode buildTree(Map<Integer, Integer> iMap, int[] inorder, int[] postorder, int rootIndex, int start, int end) {
        if (start > end)
            return null;

        if (start == end)
            return new TreeNode(postorder[rootIndex]);

        TreeNode root = new TreeNode(postorder[rootIndex]);
        int indexInInorder = iMap.get(postorder[rootIndex]);

        root.right = buildTree(iMap, inorder, postorder, rootIndex - 1, indexInInorder + 1, end);
        root.left = buildTree(iMap, inorder, postorder, rootIndex - (end - indexInInorder) - 1, start, indexInInorder - 1);

        return root;
    }
}
