package leetcode;

import leetcode.easy.RemoveElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveElementTest {

    @Test
    void testRemoveElementShouldRemoveElement1() {
        int[] nums = {3, 2, 2, 3};
        int res = RemoveElement.removeElement(nums, 3);

        Assertions.assertEquals(2, res);
    }

    @Test
    void testRemoveElementShouldRemoveElement2() {
        int[] nums = {1};
        int res = RemoveElement.removeElement(nums, 1);

        Assertions.assertEquals(0, res);
    }

}