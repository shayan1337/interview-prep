package leetcode.medium;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * 105. Construct Binary Tree from Preorder and Inorder Traversal (https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/)
 */
public class BTreeFromInorderPreorder {

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        if (inorder == null || preorder == null || inorder.length == 0 || preorder.length == 0)
            return null;

        if (inorder.length != preorder.length)
            return null;

        Queue<Integer> q = new LinkedList<>();
        for(int n : preorder)
            q.add(n);

        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<inorder.length; i++)
            map.put(inorder[i], i);

        return buildTree(q, map, 0, inorder.length - 1);
    }

    private static TreeNode buildTree(Queue<Integer> q, Map<Integer, Integer> map, int iStart, int iEnd) {
        if (iStart > iEnd)
            return null;

        TreeNode node = new TreeNode(q.poll());

        if (iStart == iEnd)
            return node;

        int indexInInOrder = map.get(node.val);
        node.left = buildTree(q, map, iStart, indexInInOrder - 1);
        node.right = buildTree(q, map, indexInInOrder + 1, iEnd);
        return node;
    }
}
