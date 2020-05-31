package leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PrisonAfterNDaysTest {

    @Test
    void testPrisonAfter_N_Days() {
        int[] input = {1, 0, 0, 1, 0, 0, 1, 0};
        int[] result = PrisonAfterNDays.prisonAfterNDays(input, 1000000000);

        Assertions.assertArrayEquals(new int[]{0, 0, 1, 1, 1, 1, 1, 0}, result);
    }

}