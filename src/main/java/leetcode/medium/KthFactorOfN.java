package leetcode.medium;

import java.util.Stack;

/**
 * 1492. The kth Factor of n (https://leetcode.com/problems/the-kth-factor-of-n/)
 */
public class KthFactorOfN {

    // O(sqrt(n)) runtime and complexity
    public int kthFactor(int n, int k) {
        int x = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                x++;
                if (n / i != i) {
                    stack.push(n / i);
                }
            }

            if (x == k)
                return i;
        }

        while (!stack.isEmpty()) {
            x++;
            int elem = stack.pop();
            if (x == k)
                return elem;
        }
        return -1;
    }
}
