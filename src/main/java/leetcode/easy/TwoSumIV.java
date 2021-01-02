package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 653. Two Sum IV - Input is a BST (https://leetcode.com/problems/two-sum-iv-input-is-a-bst/)
 */
public class TwoSumIV {

    public static boolean findTarget(TreeNode root, int k) {
        if (root == null)
            return false;

        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        return isTargetAchievable(list, k);
    }

    private static boolean isTargetAchievable(List<Integer> list, int target) {
        int start = 0;
        int end = list.size() - 1;

        while (start < end) {
            int sum = list.get(start) + list.get(end);

            if (sum == target)
                return true;

            if (sum < target)
                start++;

            else end--;
        }
        return false;
    }

    private static void inorder(TreeNode root, List<Integer> list) {
        if (root == null)
            return;

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
}
