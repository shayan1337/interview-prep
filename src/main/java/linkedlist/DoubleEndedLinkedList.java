package linkedlist;


/**
 *  A double ended linked list is a doubly linked list that has 'head' and 'tail' pointers. Head points at beginning of the list. Tail points at the end of the list.
 *  Usage : Can be used as a queue implementation
 *  Apis include:
 *  1. addFirst(int) -> adds an element to the beginning of the list
 *  2. removeFirst() -> removes an element from the beginning of the list
 *  3. addLast(int) -> adds an element to the end of the list
 *  4. removeLast() -> removes an element from the end of the list
 */
public class DoubleEndedLinkedList {

    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;
    private int numberOfElements = 0;


    /**
     * Adds an element to the head of the list
     * @param data is the data to be inserted at the head of the list
     */
    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (numberOfElements == 0) {
            head = newNode;
            tail = newNode;
            numberOfElements++;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        numberOfElements++;
    }

    /**
     * Removes first element from list
     * @return <tt>true</tt> if element is safely deleted, <t>false</tt> otherwise
     */
    public boolean removeFirst() {
        if (numberOfElements == 0)
            return false;

        if (numberOfElements == 1) {
            head = null;
            tail = null;
            numberOfElements--;
            return true;
        }

        head = head.next;
        head.prev = null;
        numberOfElements--;
        return true;
    }


    /**
     * Returns the elements in the list traversing from head
     * @return <tt>int[]</tt> of elements in the list traversing from head
     */
    public int[] values() {
        int[] values = new int[numberOfElements];
        int index = 0;

        Node current = head;

        while(current != null) {
            values[index] = current.data;
            current = current.next;
            index++;
        }

        return values;
    }

    public int size() {
        return numberOfElements;
    }
}
