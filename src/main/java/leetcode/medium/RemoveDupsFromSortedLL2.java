package leetcode.medium;

/**
 * 82. Remove Duplicates from Sorted List II (https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii)
 */
public class RemoveDupsFromSortedLL2 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return null;

        ListNode p1 = head;
        head = null;
        ListNode cur = null;

        while (p1 != null) {

            ListNode p2 = p1.next;
            int count = 0;

            while (p2 != null && p1.val == p2.val) {
                count++;
                p2 = p2.next;
            }

            if (count == 0) {
                ListNode node = new ListNode(p1.val);
                if (head == null) {
                    head = node;
                    cur = head;
                } else {
                    cur.next = node;
                    cur = cur.next;
                }
            }
            p1.next = p2;
            p1 = p2;
        }

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

