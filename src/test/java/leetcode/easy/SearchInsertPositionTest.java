package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchInsertPositionTest {

    @Test
    void testSearchInsert() {
        assertEquals(2, SearchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 5));
    }

    @Test
    void testSearchInsert1() {
        assertEquals(1, SearchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 2));
    }

    @Test
    void testSearchInsert2() {
        assertEquals(0, SearchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 0));
    }

    @Test
    void testSearchInsert3() {
        assertEquals(4, SearchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 7));
    }

}