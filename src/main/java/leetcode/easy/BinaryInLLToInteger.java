package leetcode.easy;

import java.util.Stack;

/**
 * 1290. Convert Binary Number in a Linked List to Integer (https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer)
 */
public class BinaryInLLToInteger {

    // using a stack (more time complexity)
    public static int getDecimalValue(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode cur = head;

        while(cur != null) {
            stack.push(cur.val);
            cur = cur.next;
        }

        int result = 0;
        while(!stack.empty()) {
            result += Math.pow(2, stack.pop());
        }
        return result;
    }

    // without a stack (no extra space, traverses the list once)
    public static int getDecimalValueOptimised(ListNode head) {
        ListNode cur = head;
        int result = 0;

        while(cur != null) {
            result = result * 2 + cur.val;
            cur = cur.next;
        }
        return result;
    }
}