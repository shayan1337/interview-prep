package leetcode.hard;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class WordLadderIITest {

    @Test
    void test1() {
        WordLadderII wordLadderII = new WordLadderII();
        wordLadderII.findLadders("a", "c", Arrays.asList("a", "b", "c"));
    }

}