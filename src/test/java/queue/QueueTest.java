package queue;

import linkedlist.DoublyLinkedNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    void testQueue1() {
        Queue queue = new Queue();

        DoublyLinkedNode deleted = queue.remove();

        assertNull(deleted);
    }

    @Test
    void testQueue2() {
        Queue queue = new Queue();
        queue.insert(1);

        DoublyLinkedNode deleted = queue.remove();

        assertEquals(new DoublyLinkedNode(1), deleted);
    }
}