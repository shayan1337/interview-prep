package linkedlist;

/**
 * Represents a doubly linked list with a head. Apis include
 *  1. add(int) -> adding data to the head
 *  2. remove(int) -> remove element from position passed as param (head is 0)
 *  3. insert(int data, int pos) -> insert 'data' at 'pos'
 *  4. values() -> return int[] of values in list with head as the first element
 */
public class DoublyLinkedList {

    static class Node {
        private int data;
        private Node next;
        private Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private int numberOfElements = 0;


    /**
     * Adds an element to the head of the list
     * @param data is the data to be added
     */
    public void add(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        if ( numberOfElements != 0) {
            head.prev = newNode;
        }
        head = newNode;
        numberOfElements++;
    }


    /**
     * Deletes an element at <tt>position</tt> in the list
     * @param pos is the position of the element to be deleted
     * @return <tt>true</tt> if the element has been successfully deleted; <tt>false</tt> otherwise
     */
    public boolean remove(int pos) {
        if (numberOfElements == 0 || pos < 0 || pos >= numberOfElements)
            return false;

        int currentPosition = 0;
        Node current = head;

        while(currentPosition < pos) {
            current = current.next;
            currentPosition++;
        }

        if (current == head) {
            head = head.next;
        } else {
            current.prev.next = current.next;
        }

        numberOfElements--;
        return true;
    }


    /**
     * Inserts an element at a particular position in the list
     * @param data is the data to be inserted
     * @param pos is the position where the data is to be inserted
     */
    public void insert(int data, int pos) {

    }


    /**
     * Returns the elements in the list traversing from head
     * @return the elements in the list traversing from head
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
}
