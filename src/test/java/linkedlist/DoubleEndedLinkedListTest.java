package linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DoubleEndedLinkedListTest {

    @Test
    void testAddFirstShouldAddElementToTheHeadInEmptyList() {
        DoubleEndedLinkedList doubleEndedLinkedList = new DoubleEndedLinkedList();
        doubleEndedLinkedList.addFirst(1);

        assertArrayEquals(new int[]{1}, doubleEndedLinkedList.values());
    }

    @Test
    void testAddFirstShouldAddElementToTheHeadInNonEmptyList() {
        DoubleEndedLinkedList doubleEndedLinkedList = new DoubleEndedLinkedList();
        doubleEndedLinkedList.addFirst(1);
        doubleEndedLinkedList.addFirst(2);
        doubleEndedLinkedList.addFirst(3);

        assertArrayEquals(new int[]{3, 2, 1}, doubleEndedLinkedList.values());
    }

    @Test
    void testShouldReturnFalseWhileRemovingElementFromEmptyArray() {
        DoubleEndedLinkedList doubleEndedLinkedList = new DoubleEndedLinkedList();
        DoublyLinkedNode res = doubleEndedLinkedList.removeFirst();

        assertNull(res);
        assertEquals(0, doubleEndedLinkedList.size());
        assertArrayEquals(new int[]{}, doubleEndedLinkedList.values());
    }

    @Test
    void testShouldRemoveFirstElementWithListWithOneElement() {
        DoubleEndedLinkedList doubleEndedLinkedList = new DoubleEndedLinkedList();
        doubleEndedLinkedList.addFirst(1);
        DoublyLinkedNode res = doubleEndedLinkedList.removeFirst();

        assertEquals(new DoublyLinkedNode(1), res);
        assertEquals(0, doubleEndedLinkedList.size());
        assertArrayEquals(new int[]{}, doubleEndedLinkedList.values());
    }

    @Test
    void testShouldRemoveFirstElementWithListWithMultipleElements() {
        DoubleEndedLinkedList doubleEndedLinkedList = new DoubleEndedLinkedList();
        doubleEndedLinkedList.addFirst(1);
        doubleEndedLinkedList.addFirst(2);
        doubleEndedLinkedList.addFirst(3);
        DoublyLinkedNode res = doubleEndedLinkedList.removeFirst();

        assertEquals(new DoublyLinkedNode(3), res);
        assertEquals(2, doubleEndedLinkedList.size());
        assertArrayEquals(new int[]{2, 1}, doubleEndedLinkedList.values());
    }

    @Test
    void testShouldRemoveTwoElementsFromHeadFromListWithMultipleElementsOnCallingRemoveMultipleTimes() {
        DoubleEndedLinkedList doubleEndedLinkedList = new DoubleEndedLinkedList();
        doubleEndedLinkedList.addFirst(1);
        doubleEndedLinkedList.addFirst(2);
        doubleEndedLinkedList.addFirst(3);
        doubleEndedLinkedList.addFirst(4);

        doubleEndedLinkedList.removeFirst();
        DoublyLinkedNode res = doubleEndedLinkedList.removeFirst();

        assertEquals(new DoublyLinkedNode(3), res);
        assertEquals(2, doubleEndedLinkedList.size());
        assertArrayEquals(new int[]{2, 1}, doubleEndedLinkedList.values());
    }

    @Test
    void testShouldAddElementToTheEndOfTheListWhenListIsEmpty() {
        DoubleEndedLinkedList doubleEndedLinkedList = new DoubleEndedLinkedList();

        doubleEndedLinkedList.addLast(1);

        assertEquals(1, doubleEndedLinkedList.size());
        assertArrayEquals(new int[]{1}, doubleEndedLinkedList.values());
    }

    @Test
    void testShouldAddElementToTheEndOfTheListWhenListHasOneElementOnly() {
        DoubleEndedLinkedList doubleEndedLinkedList = new DoubleEndedLinkedList();
        doubleEndedLinkedList.addFirst(1);

        doubleEndedLinkedList.addLast(2);

        assertEquals(2, doubleEndedLinkedList.size());
        assertArrayEquals(new int[]{1, 2}, doubleEndedLinkedList.values());
    }

    @Test
    void testShouldAddElementToTheEndOfTheListWhenListHasMultipleElements() {
        DoubleEndedLinkedList doubleEndedLinkedList = new DoubleEndedLinkedList();
        doubleEndedLinkedList.addFirst(1);
        doubleEndedLinkedList.addFirst(2);
        doubleEndedLinkedList.addFirst(3);

        doubleEndedLinkedList.addLast(4);

        assertEquals(4, doubleEndedLinkedList.size());
        assertArrayEquals(new int[]{3, 2, 1, 4}, doubleEndedLinkedList.values());
    }

    @Test
    void testShouldAddMultipleElementsToTheEndOfList() {
        DoubleEndedLinkedList doubleEndedLinkedList = new DoubleEndedLinkedList();

        doubleEndedLinkedList.addLast(1);
        doubleEndedLinkedList.addLast(2);
        doubleEndedLinkedList.addLast(3);

        assertEquals(3, doubleEndedLinkedList.size());
        assertArrayEquals(new int[]{1, 2, 3}, doubleEndedLinkedList.values());

    }

    @Test
    void testShouldReturnFalseWhenRemovingElementFromEmptyList() {
        DoubleEndedLinkedList doubleEndedLinkedList = new DoubleEndedLinkedList();

        boolean res = doubleEndedLinkedList.removeLast();

        assertFalse(res);
        assertEquals(0, doubleEndedLinkedList.size());
        assertArrayEquals(new int[]{}, doubleEndedLinkedList.values());
    }

    @Test
    void testShouldRemoveTheOnlyElementInTheList() {
        DoubleEndedLinkedList doubleEndedLinkedList = new DoubleEndedLinkedList();
        doubleEndedLinkedList.addFirst(1);

        boolean res = doubleEndedLinkedList.removeLast();

        assertTrue(res);
        assertEquals(0, doubleEndedLinkedList.size());
        assertArrayEquals(new int[]{}, doubleEndedLinkedList.values());
    }

    @Test
    void testShouldRemoveTheLastElementFromTheList() {
        DoubleEndedLinkedList doubleEndedLinkedList = new DoubleEndedLinkedList();
        doubleEndedLinkedList.addFirst(1);
        doubleEndedLinkedList.addFirst(2);

        boolean res = doubleEndedLinkedList.removeLast();

        assertTrue(res);
        assertEquals(1, doubleEndedLinkedList.size());
        assertArrayEquals(new int[]{2}, doubleEndedLinkedList.values());
    }

    @Test
    void testShouldRemoveMultipleElementsFromTheEndOfTheList() {
        DoubleEndedLinkedList doubleEndedLinkedList = new DoubleEndedLinkedList();
        doubleEndedLinkedList.addFirst(1);
        doubleEndedLinkedList.addFirst(2);
        doubleEndedLinkedList.addFirst(3);
        doubleEndedLinkedList.addFirst(4);

        doubleEndedLinkedList.removeLast();
        boolean res = doubleEndedLinkedList.removeLast();

        assertTrue(res);
        assertEquals(2, doubleEndedLinkedList.size());
        assertArrayEquals(new int[]{4, 3}, doubleEndedLinkedList.values());
    }
}
