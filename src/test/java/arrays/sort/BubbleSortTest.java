package arrays.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BubbleSortTest {

    @Test
    void testSortWhenArrayIsNull() {
        int[] res = BubbleSort.sort(null);
        Assertions.assertArrayEquals(new int[]{}, res);
    }

    @Test
    void testSortWhenArrayIsEmpty() {
        int[] res = BubbleSort.sort(new int[]{});
        Assertions.assertArrayEquals(new int[]{}, res);
    }

    @Test
    void testSortWhenArrayWith2Elements() {
        int[] res = BubbleSort.sort(new int[]{4,1});
        Assertions.assertArrayEquals(new int[]{1,4}, res);
    }

    @Test
    void testSortWhenArrayWith5Elements() {
        int[] res = BubbleSort.sort(new int[]{9, 6, 5, 4, 2});
        Assertions.assertArrayEquals(new int[]{2, 4, 5, 6, 9}, res);
    }

    @Test
    void testSortWhenArrayWithDuplicateElements() {
        int[] res = BubbleSort.sort(new int[]{9, 6, 5, 4, 5});
        Assertions.assertArrayEquals(new int[]{4, 5, 5, 6, 9}, res);
    }
}