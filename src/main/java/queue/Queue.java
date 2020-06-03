package queue;

import linkedlist.DoubleEndedLinkedList;
import linkedlist.DoublyLinkedNode;

/**
 * Represents a queue that stores integer values. Apis include
 * 1) insert(int) -> inserts a value at the end of the queue
 * 2) remove() -> removes an element from the head of the queue
 */
public class Queue {
    private DoubleEndedLinkedList doubleEndedLinkedList;

    public Queue() {
        doubleEndedLinkedList = new DoubleEndedLinkedList();
    }

    public void insert(int data) {
        doubleEndedLinkedList.addLast(data);
    }

    public DoublyLinkedNode remove() {
        return doubleEndedLinkedList.removeFirst();
    }
}
