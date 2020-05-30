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

    @Test
    void testShouldReturnFalseWhileRemovingElementFromEmptyArray() {
        DoubleEndedLinkedList doubleEndedLinkedList = new DoubleEndedLinkedList();
        boolean res = doubleEndedLinkedList.removeFirst();

        Assertions.assertFalse(res);
        Assertions.assertEquals(0, doubleEndedLinkedList.size());
        Assertions.assertArrayEquals(new int[]{}, doubleEndedLinkedList.values());
    }

    @Test
    void testShouldRemoveFirstElementWithListWithOneElement() {
        DoubleEndedLinkedList doubleEndedLinkedList = new DoubleEndedLinkedList();
        doubleEndedLinkedList.addFirst(1);
        boolean res = doubleEndedLinkedList.removeFirst();

        Assertions.assertTrue(res);
        Assertions.assertEquals(0, doubleEndedLinkedList.size());
        Assertions.assertArrayEquals(new int[]{}, doubleEndedLinkedList.values());
    }

    @Test
    void testShouldRemoveFirstElemntWithListWithMultipleElements() {
        DoubleEndedLinkedList doubleEndedLinkedList = new DoubleEndedLinkedList();
        doubleEndedLinkedList.addFirst(1);
        doubleEndedLinkedList.addFirst(2);
        doubleEndedLinkedList.addFirst(3);
        boolean res = doubleEndedLinkedList.removeFirst();

        Assertions.assertTrue(res);
        Assertions.assertEquals(2, doubleEndedLinkedList.size());
        Assertions.assertArrayEquals(new int[]{2, 1}, doubleEndedLinkedList.values());
    }

    @Test
    void testShouldRemoveTwoElementsFromHeadFromListWithMultipleElementsOnCallingRemoveMultipleTimes() {
        DoubleEndedLinkedList doubleEndedLinkedList = new DoubleEndedLinkedList();
        doubleEndedLinkedList.addFirst(1);
        doubleEndedLinkedList.addFirst(2);
        doubleEndedLinkedList.addFirst(3);
        doubleEndedLinkedList.addFirst(4);

        doubleEndedLinkedList.removeFirst();
        boolean res = doubleEndedLinkedList.removeFirst();

        Assertions.assertTrue(res);
        Assertions.assertEquals(2, doubleEndedLinkedList.size());
        Assertions.assertArrayEquals(new int[]{2, 1}, doubleEndedLinkedList.values());
    }
}
