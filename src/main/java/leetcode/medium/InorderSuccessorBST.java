package leetcode.medium;

/**
 * 285. Inorder Successor in BST (https://leetcode.com/problems/inorder-successor-in-bst/)
 */
public class InorderSuccessorBST {

    /**
     * Runs in O(log N) time.
     * @param root is the root of the BST
     * @param p is the node whose inorder successor is to be found
     * @return the inorder successor of p
     */
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        TreeNode parent = null;

        while(root.val != p.val) {

            if (p.val < root.val) {
                parent = root;
                root = root.left;
            }
            else
                root = root.right;
        }

        if (root.right == null)
            return (parent == null || root.val > parent.val) ? null : parent;

        root = root.right;
        while(root.left != null)
            root = root.left;

        return root;
    }
}
