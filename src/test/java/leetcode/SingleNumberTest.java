package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class SingleNumberTest {

    @Test
    void testSingleNumber() {
        int res = SingleNumber.singleNumber(new int[]{2,2,1});
        Assertions.assertEquals(1, res);
    }

}