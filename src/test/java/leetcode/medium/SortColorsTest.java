package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortColorsTest {

    @Test
    void testOptimisedSortColors() {
        int[] a =  new int[]{1, 0};
        SortColors.sortColorsInOnePass(a);

        assertArrayEquals(new int[]{0, 1}, a);
    }

    @Test
    void testOptimisedSortColors1() {
        int[] a =  new int[]{1, 0, 2};
        SortColors.sortColorsInOnePass(a);

        assertArrayEquals(new int[]{0, 1, 2}, a);
    }

    @Test
    void testOptimisedSortColors2() {
        int[] a =  new int[]{2, 0, 1, 2, 0, 1};
        SortColors.sortColorsInOnePass(a);

        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, a);
    }
}