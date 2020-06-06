package leetcode.medium;


import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 23. Merge k Sorted Lists (https://leetcode.com/problems/merge-k-sorted-lists/)
 */
public class MergeKSortedLists {

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;

        PriorityQueue<ListNodeWithIndex> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a.node.val));

        for(int i=0; i<lists.length; i++) {
            ListNode node = lists[i];

            if (node == null)
                continue;

            lists[i] = lists[i].next;
            node.next = null;
            minHeap.add(new ListNodeWithIndex(node, i));
        }

        while(!minHeap.isEmpty()) {
            ListNodeWithIndex listNodeWithIndex = minHeap.poll();
            cur.next = listNodeWithIndex.node;
            cur = cur.next;

            ListNode node = lists[listNodeWithIndex.index];

            if (node == null)
                continue;

            lists[listNodeWithIndex.index] = lists[listNodeWithIndex.index].next;
            node.next = null;
            minHeap.add(new ListNodeWithIndex(node, listNodeWithIndex.index));
        }

        return dummy.next;
    }
}

class ListNodeWithIndex {
    ListNode node;
    int index;

    ListNodeWithIndex(ListNode node, int index) {
        this.node = node;
        this.index = index;
    }
}
