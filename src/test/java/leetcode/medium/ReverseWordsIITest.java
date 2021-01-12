package leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseWordsIITest {

    @Test
    void testReverseWords2() {
        char[] chars = {'t', 'h', 'e', ' ', 's', 'k', 'y', ' ', 'i', 's', ' ', 'b', 'l', 'u', 'e'};
        ReverseWordsII.reverseWords(chars);

        char[] res = {'b','l','u','e',' ','i','s',' ','s','k','y',' ','t','h','e'};
        Assertions.assertArrayEquals(res, chars);
    }
}