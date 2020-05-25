package linkedlist;


/**
 * Represents a singly linked list with only head(without tail) where every node just contains an integer value
 */
public class SinglyLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private int numberOfElements;

    public void addFirst(int data) {

        Node newNode = new Node(data);

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

        Node newNode = new Node(data);

        Node current = head;
        Node previous = head;
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

    public boolean deleteAt(int position) {
        if (isEmpty() || position < 0 || position >= numberOfElements)
            return false;

        if (position == 0) {
            head = head.next;
            numberOfElements--;
            return true;
        }

        Node previous = head;
        Node current = head;

        int currentPos = 0;

        while(currentPos < position) {
            previous = current;
            current = current.next;
            currentPos++;
        }

        previous.next = current.next;
        numberOfElements--;
        return true;
    }

    public boolean deleteFirst() {
        return deleteAt(0);
    }

    private boolean isEmpty() {
        return numberOfElements == 0;
    }

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
