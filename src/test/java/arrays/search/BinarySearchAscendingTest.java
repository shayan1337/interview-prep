package arrays.search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class BinarySearchAscendingTest {

    @Test
    void testBinarySearchWhenArrayIsNull() {
        int index = BinarySearchAscending.search(null, 23);
        Assertions.assertEquals(-1, index);
    }

    @Test
    void testBinarySearchWhenArrayIsEmpty() {
        int index = BinarySearchAscending.search(new int[]{}, 23);
        Assertions.assertEquals(-1, index);
    }

    @Test
    void testBinarySearchWithNonEmptyArrayWithExistingElement() {
        int[] array = new int[]{1, 4, 7, 9, 13, 45};
        int index = BinarySearchAscending.search(array, 4);
        Assertions.assertEquals(1, index);
    }

    @Test
    void testBinarySearchWithNonEmptyArrayWithExistingElement1() {
        int[] array = new int[]{1, 4, 7, 9, 13, 45};
        int index = BinarySearchAscending.search(array, 1);
        Assertions.assertEquals(0, index);
    }

    @Test
    void testBinarySearchWithNonEmptyArrayWithExistingElement2() {
        int[] array = new int[]{1, 4, 7, 9, 13, 45};
        int index = BinarySearchAscending.search(array, 45);
        Assertions.assertEquals(5, index);
    }

    @Test
    void testBinarySearchWithNonEmptyArrayWithNonExistingElement() {
        int[] array = new int[]{1, 4, 7, 9, 13, 45};
        int index = BinarySearchAscending.search(array, 6);
        Assertions.assertEquals(-1, index);
    }
}