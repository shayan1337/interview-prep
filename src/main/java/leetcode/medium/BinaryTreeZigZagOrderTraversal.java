package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 103. Binary Tree Zigzag Level Order Traversal (https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/)
 */
public class BinaryTreeZigZagOrderTraversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        traverseLevelOrder(root, 0, list);
        reverseOddLevels(list);
        return list;
    }

    private void reverseOddLevels(List<List<Integer>> list) {
        int index = 1;
        while(index < list.size()) {
            List<Integer> subList = list.get(index);

            int start = 0;
            int end = subList.size() - 1;

            while(start < end) {
                int tmp = subList.get(start);
                subList.set(start, subList.get(end));
                subList.set(end, tmp);

                start++;
                end--;
            }
            index += 2;
        }
    }

    private void traverseLevelOrder(TreeNode root, int level, List<List<Integer>> list) {
        if (root == null)
            return;

        if (level == list.size())
            list.add(new ArrayList<Integer>());

        list.get(level).add(root.val);
        traverseLevelOrder(root.left, level + 1, list);
        traverseLevelOrder(root.right, level + 1, list);
    }
}
