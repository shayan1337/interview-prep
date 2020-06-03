package linkedlist;

public class SinglyLinkedNode {
    int data;
    SinglyLinkedNode next;

    public SinglyLinkedNode(int data) {
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

        SinglyLinkedNode node = (SinglyLinkedNode) obj;
        return this.data == node.data;
    }
}
