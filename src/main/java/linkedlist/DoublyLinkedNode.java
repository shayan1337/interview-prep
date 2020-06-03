package linkedlist;

public class DoublyLinkedNode {
    int data;
    DoublyLinkedNode next;
    DoublyLinkedNode prev;

    public DoublyLinkedNode(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if((obj == null) || (obj.getClass() != this.getClass()))
            return false;

        DoublyLinkedNode node = (DoublyLinkedNode) obj;
        return this.data == node.data;
    }
}
