package leetcode.medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 449. Serialize and Deserialize BST (https://leetcode.com/problems/serialize-and-deserialize-bst/solution/)
 */
public class SerialiseAndDeserialiseBST {

    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        traverse(root, sb);
        return sb.toString().trim();
    }

    private void traverse(TreeNode root, StringBuilder sb) {
        if (root == null)
            return;

        sb.append(root.val).append(" ");
        traverse(root.left, sb);
        traverse(root.right, sb);
    }

    // works in O(NlogN) time
    public TreeNode deserialize(String data) {
        if (data == null || data.length() == 0)
            return null;

        String[] arr = data.split(" ");
        TreeNode root = null;

        for (String s : arr) {
            TreeNode node = new TreeNode(Integer.parseInt(s));
            if (root == null) {
                root = node;
                continue;
            }

            TreeNode current = root;
            TreeNode parent = root;

            while (current != null) {
                parent = current;
                if (node.val > current.val)
                    current = current.right;
                else
                    current = current.left;
            }

            if (node.val <= parent.val)
                parent.left = node;
            else
                parent.right = node;
        }
        return root;
    }

    // works in O(N) time
    public TreeNode deserializeRecursive(String data) {
        if (data == null || data.length() == 0)
            return null;

        String[] arr = data.split(" ");
        Queue<String> q = new LinkedList<>(Arrays.asList(arr));

        return deserializeRecursive(Integer.MIN_VALUE, Integer.MAX_VALUE, q);
    }

    private TreeNode deserializeRecursive(int lower, int upper, Queue<String> q) {
        if (q.isEmpty())
            return null;

        if ( Integer.parseInt(q.peek()) < lower || Integer.parseInt(q.peek()) > upper)
            return null;

        TreeNode root = new TreeNode(Integer.parseInt(q.poll()));
        root.left = deserializeRecursive(lower, root.val, q);
        root.right = deserializeRecursive(root.val, upper, q);
        return root;
    }
}
