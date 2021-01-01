package leetcode.hard;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 297. Serialize and Deserialize Binary Tree (https://leetcode.com/problems/serialize-and-deserialize-binary-tree/)
 */
public class SerialiseAndDeserialiseBinaryTree {

    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        traverseTree(root, sb);
        return sb.toString().trim();
    }

    private void traverseTree(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("X ");
            return;
        }

        sb.append(root.val).append(" ");

        traverseTree(root.left, sb);
        traverseTree(root.right, sb);
    }

    public TreeNode deserialize(String data) {
        String []arr = data.split(" ");
        Queue<String> q = new LinkedList<>(Arrays.asList(arr));

        return deserialise(q);
    }

    private TreeNode deserialise(Queue<String> q) {
        String data = q.poll();

        if (data.equals("X"))
            return null;

        TreeNode root = new TreeNode(Integer.parseInt(data));
        root.left = deserialise(q);
        root.right = deserialise(q);

        return root;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
