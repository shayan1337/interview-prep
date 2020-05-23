package arrays.search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinarySearchTest {

    @Test
    void testBinarySearchWhenArrayIsNull() {
        int index = BinarySearch.search(null, 23);
        Assertions.assertEquals(-1, index);
    }

    @Test
    void testBinarySearchWhenArrayIsEmpty() {
        int index = BinarySearch.search(new int[]{}, 23);
        Assertions.assertEquals(-1, index);
    }

    @Test
    void testBinarySearchWithNonEmptyArrayWithExistingElement() {
        int[] array = new int[]{1, 4, 7, 9, 13, 45};
        int index = BinarySearch.search(array, 4);
        Assertions.assertEquals(1, index);
    }

    @Test
    void testBinarySearchWithNonEmptyArrayWithExistingElement1() {
        int[] array = new int[]{1, 4, 7, 9, 13, 45};
        int index = BinarySearch.search(array, 1);
        Assertions.assertEquals(0, index);
    }

    @Test
    void testBinarySearchWithNonEmptyArrayWithExistingElement2() {
        int[] array = new int[]{1, 4, 7, 9, 13, 45};
        int index = BinarySearch.search(array, 45);
        Assertions.assertEquals(5, index);
    }

    @Test
    void testBinarySearchWithNonEmptyDescendingArrayWithExistingElement() {
        int[] array = new int[]{45, 34, 23, 12, 6, 4, 1};
        int index = BinarySearch.search(array, 45);
        Assertions.assertEquals(0, index);
    }

    @Test
    void testBinarySearchWithNonEmptyDescendingArrayWithExistingElement1() {
        int[] array = new int[]{45, 34, 23, 12, 6, 4, 1};
        int index = BinarySearch.search(array, 23);
        Assertions.assertEquals(2, index);
    }

    @Test
    void testBinarySearchWithNonEmptyArrayWithNonExistingElement() {
        int[] array = new int[]{1, 4, 7, 9, 13, 45};
        int index = BinarySearch.search(array, 6);
        Assertions.assertEquals(-1, index);
    }

}