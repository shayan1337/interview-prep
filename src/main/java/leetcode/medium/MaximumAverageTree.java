package leetcode.medium;

/**
 * 1120. Maximum Average Subtree (https://leetcode.com/problems/maximum-average-subtree/)
 */
public class MaximumAverageTree {

    public double maximumAverageSubtree(TreeNode root) {
        State state = maxAvg(root);
        return state.maxAverage;
    }

    private State maxAvg(TreeNode root) {
        if (root == null)
            return new State(0, 0.0, 0.0);

        State leftSubtreeState = maxAvg(root.left);
        State rightSubtreeState = maxAvg(root.right);

        int currentTreeNodeCount = leftSubtreeState.nodeCount + rightSubtreeState.nodeCount + 1;
        double currentTreeSum = root.val + leftSubtreeState.sum + rightSubtreeState.sum;

        double average = currentTreeSum / currentTreeNodeCount;
        double maxAverage = Math.max(average, Math.max(leftSubtreeState.maxAverage, rightSubtreeState.maxAverage));

        return new State(currentTreeNodeCount, currentTreeSum, maxAverage);
    }
}

class State {
    int nodeCount;
    double sum;
    double maxAverage;

    State(int _nodeCount, double _sum, double _maxAverage) {
        nodeCount = _nodeCount;
        sum = _sum;
        maxAverage = _maxAverage;
    }
}