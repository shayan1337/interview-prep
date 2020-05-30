package linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircularLinkedListTest {

    @Test
    void testAddShouldAddElementsToTheList() {
        CircularLinkedList circularLinkedList = new CircularLinkedList();

        circularLinkedList.add(1);
        circularLinkedList.add(2);
        circularLinkedList.add(3);
        circularLinkedList.add(4);

        assertEquals(4, circularLinkedList.size());
        assertArrayEquals(new int[]{4, 3, 2, 1}, circularLinkedList.values());
    }

    @Test
    void testRemoveShouldReturnFalseForEmptyList() {
        CircularLinkedList circularLinkedList = new CircularLinkedList();

        boolean res = circularLinkedList.remove();

        assertFalse(res);
        assertEquals(0, circularLinkedList.size());
        assertArrayEquals(new int[]{}, circularLinkedList.values());
    }

    @Test
    void testRemoveShouldRemoveTheOnlyElementInTheList() {
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.add(1);

        boolean res = circularLinkedList.remove();

        assertTrue(res);
        assertEquals(0, circularLinkedList.size());
        assertArrayEquals(new int[]{}, circularLinkedList.values());
    }

    @Test
    void testRemoveShouldRemoveElementFromHeadInTheList() {
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.add(1);
        circularLinkedList.add(2);
        circularLinkedList.add(3);

        boolean res = circularLinkedList.remove();

        assertTrue(res);
        assertEquals(2, circularLinkedList.size());
        assertArrayEquals(new int[]{2, 1}, circularLinkedList.values());
    }

    @Test
    void testRemoveShouldRemoveMultipleElementsFromHeadInTheList() {
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.add(1);
        circularLinkedList.add(2);
        circularLinkedList.add(3);

        circularLinkedList.remove();
        boolean res = circularLinkedList.remove();

        assertTrue(res);
        assertEquals(1, circularLinkedList.size());
        assertArrayEquals(new int[]{1}, circularLinkedList.values());
    }

    @Test
    void testRemoveShouldRemoveAllElementsFromTheList() {
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.add(1);
        circularLinkedList.add(2);

        circularLinkedList.remove();
        boolean res = circularLinkedList.remove();

        assertTrue(res);
        assertEquals(0, circularLinkedList.size());
        assertArrayEquals(new int[]{}, circularLinkedList.values());
    }

    @Test
    void testShouldInsertElementAtAppropriatePosition() {
        CircularLinkedList circularLinkedList = new CircularLinkedList();

        circularLinkedList.insert(1, 0);

        assertEquals(1, circularLinkedList.size());
        assertArrayEquals(new int[]{1}, circularLinkedList.values());
    }

    @Test
    void testShouldInsertElementAtTheEndOfTheList() {
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.add(1);
        circularLinkedList.add(2);
        circularLinkedList.add(3);

        circularLinkedList.insert(4, 3);

        assertEquals(4, circularLinkedList.size());
        assertArrayEquals(new int[]{3, 2, 1, 4}, circularLinkedList.values());
    }

    @Test
    void testShouldInsertMultipleElementsAtTheEndOfTheList() {
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.add(1);
        circularLinkedList.add(2);
        circularLinkedList.add(3);

        circularLinkedList.insert(4, 3);
        circularLinkedList.insert(5, 4);

        assertEquals(5, circularLinkedList.size());
        assertArrayEquals(new int[]{3, 2, 1, 4, 5}, circularLinkedList.values());
    }
}