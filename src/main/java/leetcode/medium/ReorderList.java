package leetcode.medium;


/**
 * Premium
 * 143. Reorder List (https://leetcode.com/problems/reorder-list/)
 */
public class ReorderList {

    public void reorderList(ListNode head) {
        if (head == null || head.next == null)
            return;

        /* Find the middle of the list */
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        /* Reverse the second half of the list */
        ListNode prev = null;
        ListNode cur = slow;

        while (cur != null) {
            ListNode temp = cur.next;

            cur.next = prev;
            prev = cur;
            cur = temp;
        }

        /* Merge both lists */
        ListNode first = head;
        ListNode second = prev;

        while (second.next != null) {
            ListNode tmp = first.next;
            first.next = second;
            first = tmp;

            tmp = second.next;
            second.next = first;
            second = tmp;
        }
    }
}
