package linkedlist;

/**
 * Represents a doubly linked list with a head. Apis include
 *  1. add(int) -> adding data to the head
 *  2. remove(int) -> remove element from position passed as param (head is 0)
 *  3. insert(int data, int pos) -> insert 'data' at 'pos'
 *  4. values() -> return int[] of values in list with head as the first element
 */
public class DoublyLinkedList {

    private DoublyLinkedNode head;
    private int numberOfElements = 0;


    /**
     * Adds an element to the head of the list
     * @param data is the data to be added
     */
    public void add(int data) {
        DoublyLinkedNode newNode = new DoublyLinkedNode(data);

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
    public DoublyLinkedNode remove(int pos) {
        if (numberOfElements == 0 || pos < 0 || pos >= numberOfElements)
            return null;

        int currentPosition = 0;
        DoublyLinkedNode current = head;

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
        return current;
    }


    /**
     * Inserts an element at a particular position in the list
     * @param data is the data to be inserted
     * @param pos is the position where the data is to be inserted
     */
    public void insert(int data, int pos) {
        if (pos < 0 || pos > numberOfElements)
            return;

        int currentPosition = 0;
        DoublyLinkedNode current = head;
        DoublyLinkedNode previous = head;

        while(currentPosition < pos) {
            previous = current;
            current = current.next;
            currentPosition++;
        }

        if (currentPosition == 0) {
            add(data);
            return;
        }

        DoublyLinkedNode newNode = new DoublyLinkedNode(data);

        newNode.next = current;
        newNode.prev = previous;
        previous.next = newNode;

        if (current != null) {
            current.prev = newNode;
        }

        numberOfElements++;
    }


    /**
     * Returns the elements in the list traversing from head
     * @return the elements in the list traversing from head
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
}
