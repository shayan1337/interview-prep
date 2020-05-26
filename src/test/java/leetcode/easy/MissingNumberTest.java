package leetcode.easy;

import leetcode.easy.MissingNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class MissingNumberTest {

    @Test
    void testMissingNumber() {
        int res = MissingNumber.missingNumber(new int[]{5,2,0,3,4});
        Assertions.assertEquals(1, res);
    }

}