package leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class LargestDivisibleSubsetTest {

    @Test
    void testLargestDivisibleSubset() {
        List<Integer> res = LargestDivisibleSubset.largestDivisibleSubset(new int[]{3, 4, 16, 8});

        Assertions.assertIterableEquals(Arrays.asList(4, 8, 16), res);
    }

    @Test
    void testLargestDivisibleSubset2() {
        List<Integer> res = LargestDivisibleSubset.largestDivisibleSubset(new int[]{1, 2, 3});

        Assertions.assertIterableEquals(Arrays.asList(1, 2), res);
    }
}