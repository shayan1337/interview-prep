package leetcode.medium;

/**
 * 19. Remove Nth Node From End of List (https://leetcode.com/problems/remove-nth-node-from-end-of-list/)
 */
public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null)
            return null;

        ListNode p1 = head;
        ListNode p2 = head;
        ListNode prevp2 = head;

        while(n-- > 0) {
            p1 = p1.next;
        }

        while(p1 != null) {
            prevp2 = p2;
            p2 = p2.next;
            p1 = p1.next;
        }

        if (p2 == head)
            head = head.next;
        else
            prevp2.next = p2.next;
        return head;
    }
}
