package linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DoubleEndedLinkedListTest {

    @Test
    void testAddFirstShouldAddElementToTheHeadInEmptyList() {
        DoubleEndedLinkedList doubleEndedLinkedList = new DoubleEndedLinkedList();
        doubleEndedLinkedList.addFirst(1);

        Assertions.assertArrayEquals(new int[]{1}, doubleEndedLinkedList.values());
    }

    @Test
    void testAddFirstShouldAddElementToTheHeadInNonEmptyList() {
        DoubleEndedLinkedList doubleEndedLinkedList = new DoubleEndedLinkedList();
        doubleEndedLinkedList.addFirst(1);
        doubleEndedLinkedList.addFirst(2);
        doubleEndedLinkedList.addFirst(3);

        Assertions.assertArrayEquals(new int[]{3, 2, 1}, doubleEndedLinkedList.values());
    }
}
