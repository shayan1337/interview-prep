package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class MostCommonWordTest {

    @Test
    void testMostCommonWord() {
        assertEquals("the", MostCommonWord.mostCommonWord("abc abc? abcd the jeff!", new String[]{"abc", "abcd", "jeff"}));
    }
}