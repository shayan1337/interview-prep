package linkedlist;

/**
 *  A double ended linked list has 'head' and 'tail' pointers. Head points at beginnning of the list. Tail points at the end of the list. This list is singly linked list.
 *  Usage : Can be used as a queue implementation
 */
public class DoubleEndedLinkedList {

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

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (numberOfElements == 0) {
            head = newNode;
            tail = newNode;
            numberOfElements++;
            return;
        }


    }

    public void removeLast() {}

    public boolean deleteAt(int position) {
        return true;
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
