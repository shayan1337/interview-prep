package linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DoublyLinkedListTest {

    @Test
    void testIteratingThroughAnEmptyListShouldReturnEmptyList() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        Assertions.assertArrayEquals(new int[]{}, doublyLinkedList.values());
    }

    @Test
    void testShouldAddElementsToTheHeadOfTheList() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.add(1);
        doublyLinkedList.add(2);
        doublyLinkedList.add(3);

        Assertions.assertArrayEquals(new int[]{3, 2, 1}, doublyLinkedList.values());
    }

    @Test
    void testShouldReturnFalseForEmptyList() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        boolean res = doublyLinkedList.remove(0);

        Assertions.assertFalse(res);
        Assertions.assertArrayEquals(new int[]{}, doublyLinkedList.values());
    }

    @Test
    void testShouldReturnFalseForInvalidPosition() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.add(20);
        boolean res = doublyLinkedList.remove(-1);

        Assertions.assertFalse(res);
        Assertions.assertArrayEquals(new int[]{20}, doublyLinkedList.values());
    }

    @Test
    void testShouldReturnFalseForPositionEqualToNumberOfElementsInList() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.add(20);
        boolean res = doublyLinkedList.remove(1);

        Assertions.assertFalse(res);
        Assertions.assertArrayEquals(new int[]{20}, doublyLinkedList.values());
    }

    @Test
    void testShouldReturnFalseForPositionGreaterThanNumberOfElementsInList() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.add(20);
        boolean res = doublyLinkedList.remove(2);

        Assertions.assertFalse(res);
        Assertions.assertArrayEquals(new int[]{20}, doublyLinkedList.values());
    }

    @Test
    void testShouldRemoveTheOnlyElementInTheList() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.add(20);
        boolean res = doublyLinkedList.remove(0);

        Assertions.assertTrue(res);
        Assertions.assertArrayEquals(new int[]{}, doublyLinkedList.values());
    }

    @Test
    void testShouldRemoveElementFromMiddleInTheList() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.add(20);
        doublyLinkedList.add(30);
        doublyLinkedList.add(40);
        boolean res = doublyLinkedList.remove(1);

        Assertions.assertTrue(res);
        Assertions.assertArrayEquals(new int[]{40, 20}, doublyLinkedList.values());
    }

    @Test
    void testShouldRemoveElementFromTheEndOfTheList() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.add(20);
        doublyLinkedList.add(30);
        doublyLinkedList.add(40);
        boolean res = doublyLinkedList.remove(2);

        Assertions.assertTrue(res);
        Assertions.assertArrayEquals(new int[]{40, 30}, doublyLinkedList.values());
    }

}