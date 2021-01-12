package leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseWordsTest {

    @Test
    void testReverseWords() {
        String res = ReverseWords.reverseWords("the sky is blue");
        Assertions.assertEquals("blue is sky the", res);
    }
}