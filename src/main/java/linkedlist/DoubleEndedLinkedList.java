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

    private DoublyLinkedNode head;
    private DoublyLinkedNode tail;
    private int numberOfElements = 0;


    /**
     * Adds an element to the head of the list
     * @param data is the data to be inserted at the head of the list
     */
    public void addFirst(int data) {
        DoublyLinkedNode newNode = new DoublyLinkedNode(data);

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
    public DoublyLinkedNode removeFirst() {
        if (numberOfElements == 0)
            return null;

        if (numberOfElements == 1) {
            DoublyLinkedNode deleted = head;
            head = null;
            tail = null;
            numberOfElements--;
            return deleted;
        }

        DoublyLinkedNode deleted = head;
        head = head.next;
        head.prev = null;
        numberOfElements--;
        return deleted;
    }


    /**
     * Adds an element to the end of the list
     * @param data is the data to be inserted
     */
    public void addLast(int data) {
        DoublyLinkedNode newNode = new DoublyLinkedNode(data);

        if (numberOfElements == 0) {
            head = newNode;
            tail = newNode;
            numberOfElements++;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        numberOfElements++;
    }


    /**
     * Removes an element from the end of the list
     * @return <tt>true</tt> when element is safely deleted; <tt>false</tt> otherwise
     */
    public boolean removeLast() {
        if (numberOfElements == 0)
            return false;

        if (numberOfElements == 1) {
            head = null;
            tail = null;
            numberOfElements--;
            return true;
        }

        tail = tail.prev;
        tail.next = null;
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

        DoublyLinkedNode current = head;

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
