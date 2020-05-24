package arrays.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class InsertionSortTest {

    @Test
    void testSortWhenArrayIsNull() {
        InsertionSort.sort(null);
    }

    @Test
    void testSortWhenArrayIsEmpty() {
        int[] nums = {};
        InsertionSort.sort(nums);
        Assertions.assertArrayEquals(new int[]{}, nums);
    }

    @Test
    void testSortWhenArrayWith2Elements() {
        int[] nums = {4, 1};
        InsertionSort.sort(nums);
        Assertions.assertArrayEquals(new int[]{1,4}, nums);
    }

    @Test
    void testSortWhenArrayWith5Elements() {
        int[] nums = {9, 6, 5, 4, 2};
        InsertionSort.sort(nums);
        Assertions.assertArrayEquals(new int[]{2, 4, 5, 6, 9}, nums);
    }

    @Test
    void testSortWhenArrayWithDuplicateElements() {
        int[] nums = {9, 6, 5, 4, 5};
        InsertionSort.sort(nums);
        Assertions.assertArrayEquals(new int[]{4, 5, 5, 6, 9}, nums);
    }
}