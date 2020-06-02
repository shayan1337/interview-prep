package leetcode.easy;


/**
 * 83. Remove Duplicates from Sorted List (https://leetcode.com/problems/remove-duplicates-from-sorted-list/)
 */
public class RemoveDupsFromSortedLL {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return null;

        ListNode p1 = head;
        ListNode p2 = p1.next;

        while (p2 != null) {
            if (p1.val != p2.val) {
                p1.next = p2;
                p1 = p2;
            }
            p2 = p2.next;
        }

        p1.next = p2;
        return head;
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
