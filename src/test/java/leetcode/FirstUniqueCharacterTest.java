package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FirstUniqueCharacterTest {

    @Test
    void testFirstUniqueChar() {
        int res = FirstUniqueCharacter.firstUniqChar("leetcode");
        Assertions.assertEquals(0, res);
    }

    @Test
    void testFirstUniqueCharWithNoUniqueChars() {
        int res = FirstUniqueCharacter.firstUniqChar("leetcodeleetcode");
        Assertions.assertEquals(-1, res);
    }

    @Test
    void testFirstUniqueCharWithEmptyString() {
        int res = FirstUniqueCharacter.firstUniqChar("");
        Assertions.assertEquals(-1, res);
    }

}