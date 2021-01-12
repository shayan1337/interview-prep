package leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    void test1() {
        int res = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("pwwkew");
        Assertions.assertEquals(3, res);
    }

}