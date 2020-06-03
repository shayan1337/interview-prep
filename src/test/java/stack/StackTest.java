package stack;

import linkedlist.SinglyLinkedNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void testStack1() {
        Stack stack = new Stack();
        SinglyLinkedNode data = stack.pop();

        assertNull(data);
    }

    @Test
    void testStack2() {
        Stack stack = new Stack();
        stack.push(1);
        SinglyLinkedNode data = stack.pop();

        assertEquals(new SinglyLinkedNode(1), data);
    }

    @Test
    void testStack3() {
        Stack stack = new Stack();
        stack.push(1);

        stack.pop();
        SinglyLinkedNode data = stack.pop();

        assertNull(data);
    }
}