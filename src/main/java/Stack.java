import linkedlist.SinglyLinkedList;
import linkedlist.SinglyLinkedNode;

/**
 * Represents a Stack that stores integer elements. Apis include:
 * 1) push(int) -> pushes an integer value into stack
 * 2) pop() -> pop the latest value from the stack
 */
public class Stack {
    private SinglyLinkedList singlyLinkedList;

    public Stack() {
        singlyLinkedList = new SinglyLinkedList();
    }

    public void push(int data) {
        singlyLinkedList.addFirst(data);
    }

    public SinglyLinkedNode pop() {
        return singlyLinkedList.deleteFirst();
    }
}
