package ctci.sortandsearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SortedMergeTest {

    @Test
    void testSortedMergeShouldMergeBIntoA() {
        int[] A = {2, 3, 5, 9, 10, 0, 0, 0, 0, 0};
        int[] B = {1, 4, 6, 7, 8};

        SortedMerge.sortedMerge(A, B, 4);

        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, A);
    }

}