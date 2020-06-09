package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsSubsequenceTest {

    @Test
    void testIsSubsequence1() {
        assertTrue(IsSubsequence.isSubsequence("abc", "ahgbdsgcsd"));
    }

    @Test
    void testIsSubsequence2() {
        assertFalse(IsSubsequence.isSubsequence("abc", "ahgbdsgsd"));
    }

}