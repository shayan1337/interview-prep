package linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class SinglyLinkedListTest {

    @DisplayName("On iterating through an empty list, the returned result should be empty")
    @Test
    void testAddFirstShouldAddElementsToTheHead1() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        Assertions.assertArrayEquals(new int[]{}, singlyLinkedList.values());
    }

    @Test
    void testAddFirstShouldAddElementsToTheHead2() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addFirst(1);
        singlyLinkedList.addFirst(2);
        singlyLinkedList.addFirst(3);
        singlyLinkedList.addFirst(4);

        Assertions.assertArrayEquals(new int[]{4, 3, 2, 1}, singlyLinkedList.values());
    }

    @Test
    void testAddFirstShouldAddElementsToTheHead3() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addFirst(4);
        singlyLinkedList.addFirst(3);
        singlyLinkedList.addFirst(2);
        singlyLinkedList.addFirst(1);

        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4}, singlyLinkedList.values());
    }

    @DisplayName("insertAt() should return false for invalid position of -1")
    @Test
    void testInsertAt1() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        boolean inserted = singlyLinkedList.insertAt(12, -1);

        Assertions.assertFalse(inserted);
        Assertions.assertArrayEquals(new int[]{}, singlyLinkedList.values());
    }

    @DisplayName("insertAt() should return false for position > nums of elements in list")
    @Test
    void testInsertAt2() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addFirst(1);
        boolean inserted = singlyLinkedList.insertAt(2, 2);

        Assertions.assertFalse(inserted);
        Assertions.assertArrayEquals(new int[]{1}, singlyLinkedList.values());
    }

    @DisplayName("insertAt() should insert element into empty list when position is 0")
    @Test
    void testInsertAt3() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        boolean inserted = singlyLinkedList.insertAt(1, 0);

        Assertions.assertTrue(inserted);
        Assertions.assertArrayEquals(new int[]{1}, singlyLinkedList.values());
    }

    @DisplayName("insertAt() should insert element at the end of a non empty list")
    @Test
    void testInsertAt4() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addFirst(1);
        singlyLinkedList.addFirst(2);
        singlyLinkedList.addFirst(3);
        boolean inserted = singlyLinkedList.insertAt(4, 3);

        Assertions.assertTrue(inserted);
        Assertions.assertArrayEquals(new int[]{3, 2, 1, 4}, singlyLinkedList.values());
    }

    @DisplayName("insertAt() should insert element at the middle of a non empty list")
    @Test
    void testInsertAt5() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addFirst(1);
        singlyLinkedList.addFirst(2);
        singlyLinkedList.addFirst(3);
        singlyLinkedList.addFirst(4);
        boolean inserted = singlyLinkedList.insertAt(5, 2);

        Assertions.assertTrue(inserted);
        Assertions.assertArrayEquals(new int[]{4, 3, 5, 2, 1}, singlyLinkedList.values());
    }

    @DisplayName("deleteAt() should return false empty list")
    @Test
    void testDeleteAt() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        boolean deleted = singlyLinkedList.deleteAt(0);

        Assertions.assertFalse(deleted);
        Assertions.assertArrayEquals(new int[]{}, singlyLinkedList.values());
    }

    @DisplayName("deleteAt() should return false for invalid position of -1")
    @Test
    void testDeleteAt1() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        boolean deleted = singlyLinkedList.deleteAt(-1);

        Assertions.assertFalse(deleted);
        Assertions.assertArrayEquals(new int[]{}, singlyLinkedList.values());
    }

    @DisplayName("deleteAt() should return false for position > nums of elements in list")
    @Test
    void testDeleteAt2() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addFirst(1);
        boolean deleted = singlyLinkedList.deleteAt( 1);

        Assertions.assertFalse(deleted);
        Assertions.assertArrayEquals(new int[]{1}, singlyLinkedList.values());
    }

    @DisplayName("deleteAt() should delete the only element present in the list")
    @Test
    void testDeleteAt4() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addFirst(1);
        boolean deleted = singlyLinkedList.deleteAt(0);

        Assertions.assertTrue(deleted);
        Assertions.assertArrayEquals(new int[]{}, singlyLinkedList.values());
    }

    @DisplayName("deleteAt() should delete element from position in a non empty list")
    @Test
    void testDeleteAt5() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addFirst(1);
        singlyLinkedList.addFirst(2);
        singlyLinkedList.addFirst(3);
        singlyLinkedList.addFirst(4);
        boolean deleted = singlyLinkedList.deleteAt(3);

        Assertions.assertTrue(deleted);
        Assertions.assertArrayEquals(new int[]{4, 3, 2}, singlyLinkedList.values());
    }

    @DisplayName("deleteFirst() should delete first element from list")
    @Test
    void testDeleteFirst() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addFirst(1);
        singlyLinkedList.addFirst(2);
        boolean deleted = singlyLinkedList.deleteFirst();

        Assertions.assertTrue(deleted);
        Assertions.assertArrayEquals(new int[]{1}, singlyLinkedList.values());
    }

}