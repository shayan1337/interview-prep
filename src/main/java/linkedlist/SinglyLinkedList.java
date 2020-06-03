package linkedlist;


/**
 * Represents a singly linked list with only head(without tail) where every node just contains an integer value
 */
public class SinglyLinkedList {

    private SinglyLinkedNode head;
    private int numberOfElements;

    public void addFirst(int data) {

        SinglyLinkedNode newNode = new SinglyLinkedNode(data);

        newNode.next = head;

        head = newNode;

        numberOfElements++;
    }

    public boolean insertAt(int data, int position) {
        if (position < 0 || position > numberOfElements)
            return false;

        if (isEmpty()) {
            addFirst(data);
            return true;
        }

        SinglyLinkedNode newNode = new SinglyLinkedNode(data);

        SinglyLinkedNode current = head;
        SinglyLinkedNode previous = head;
        int elementsTraversed = 0;

        while(current != null && elementsTraversed < position) {
            previous = current;
            current = current.next;
            elementsTraversed++;
        }

        newNode.next = current;
        previous.next = newNode;
        numberOfElements++;
        return true;
    }

    public SinglyLinkedNode deleteAt(int position) {
        if (isEmpty() || position < 0 || position >= numberOfElements)
            return null;

        if (position == 0) {
            SinglyLinkedNode toBeDeleted = head;
            head = head.next;
            numberOfElements--;
            return toBeDeleted;
        }

        SinglyLinkedNode previous = head;
        SinglyLinkedNode current = head;

        int currentPos = 0;

        while(currentPos < position) {
            previous = current;
            current = current.next;
            currentPos++;
        }

        previous.next = current.next;
        numberOfElements--;
        return current;
    }

    public SinglyLinkedNode deleteFirst() {
        return deleteAt(0);
    }

    private boolean isEmpty() {
        return numberOfElements == 0;
    }

    public int[] values() {
        int[] values = new int[numberOfElements];
        int index = 0;

        SinglyLinkedNode current = head;

        while(current != null) {
            values[index] = current.data;
            current = current.next;
            index++;
        }

        return values;
    }
}
