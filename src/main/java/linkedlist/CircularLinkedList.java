package linkedlist;


/**
 * Represents a circular linked list where the last element points to the head of the list
 * APIs include :
 * 1) add(int) -> adds value to the head of the list
 * 2) remove() -> removes element from the head of the list
 * 3) insert(int, int) -> adds element at a particular position in the list
 */
public class CircularLinkedList {

    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;
    private int numberOfElements = 0;


    /**
     * Add an element to the head of the list
     * @param data is the data to be inserted at the head of the list
     */
    public void add(int data) {
        Node newNode = new Node(data);

        if (numberOfElements == 0) {
            head = newNode;
            tail = newNode;
            numberOfElements++;
            return;
        }

        newNode.next = head;
        head = newNode;
        tail.next = head;
        numberOfElements++;
    }


    /**
     * Remove element from the head of the list
     * @return <tt>true</tt> if element is deleted; <tt>false</tt> otherwise
     */
    public boolean remove() {
        if (numberOfElements == 0)
            return false;

        if (numberOfElements == 1) {
            head = null;
            tail = null;
            numberOfElements--;
            return true;
        }

        head = head.next;
        tail.next = head;
        numberOfElements--;
        return true;
    }


    /**
     * Inserts element at a particular position in the list
     * @param data is the data to be inserted
     * @param pos is the position in which the new element is to be inserted
     */
    public void insert(int data, int pos) {
        if (pos < 0 || pos > numberOfElements)
            return;

        Node current = head;
        Node previous = head;
        int currentPos = 0;
        boolean tailTraversed = false;

        while(current != null && currentPos < pos && !tailTraversed) {
            previous = current;
            current = current.next;
            currentPos++;

            tailTraversed = previous == tail;
        }

        if ((current == head && !tailTraversed) || current == null) {
            add(data);
            return;
        }

        if (tailTraversed) {
            addToTail(data);
            return;
        }

        Node newNode = new Node(data);

        newNode.next = current;
        previous.next = newNode;
        numberOfElements++;
    }

    private void addToTail(int data) {
        Node newNode = new Node(data);
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
        numberOfElements++;
    }


    public int[] values() {
        int[] values = new int[numberOfElements];
        int index = 0;

        Node current = head;
        boolean tailTraversed = false;

        while(current != null && !tailTraversed) {
            values[index] = current.data;
            index++;

            tailTraversed = current == tail;
            current = current.next;
        }

        return values;
    }


    public int size() {
        return  numberOfElements;
    }
}
