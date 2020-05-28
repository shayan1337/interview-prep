package leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveDuplicatesFromSortedArrayTest {

    @Test
    void testRemoveDupsShouldRemoveDups1() {
        int[] nums = {1,1,2};
        int res = RemoveDuplicatesFromSortedArray.removeDuplicates(nums);

        Assertions.assertEquals(2, res);
    }

    @Test
    void testRemoveDupsShouldRemoveDups2() {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int res = RemoveDuplicatesFromSortedArray.removeDuplicates(nums);

        Assertions.assertEquals(5, res);
    }

}