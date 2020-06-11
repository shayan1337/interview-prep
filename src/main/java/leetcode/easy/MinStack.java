package leetcode.easy;

/**
 * 155. Min Stack (https://leetcode.com/problems/min-stack/)
 */
public class MinStack {
    private StackNode head;
    private int minVal;

    public MinStack() {
        head = null;
        minVal = Integer.MAX_VALUE;
    }

    public void push(int x) {
        if (x < minVal)
            minVal = x;

        StackNode node = new StackNode(x, minVal);

        node.next = head;
        head = node;
    }

    public void pop() {
        if (head == null)
            return;
        head = head.next;

        if (head == null)
            minVal = Integer.MAX_VALUE;
        else
            minVal = head.min;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return minVal;
    }
}

class StackNode {
    int val;
    int min;
    StackNode next;

    StackNode(int v, int m) {
        val = v;
        min = m;
    }
}
