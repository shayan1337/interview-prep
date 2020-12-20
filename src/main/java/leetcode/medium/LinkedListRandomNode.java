package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 382. Linked List Random Node (https://leetcode.com/problems/linked-list-random-node/)
 */
public class LinkedListRandomNode {

    private final List<Integer> list = new ArrayList<>();

    public LinkedListRandomNode(ListNode head) {
        ListNode cur = head;
        while(cur != null) {
            list.add(cur.val);
            cur = cur.next;
        }
    }

    /** Returns a random node's value. */
    public int getRandom() {
        int index = (int)(Math.random() * list.size());
        return list.get(index);
    }
}
