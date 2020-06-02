package leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomisedSetTest {

    @Test
    void testRandomisedSet() {
        RandomisedSet randomisedSet = new RandomisedSet();

        randomisedSet.insert(1);
        randomisedSet.remove(2);
        randomisedSet.insert(2);
        randomisedSet.getRandom();
        randomisedSet.remove(1);
        randomisedSet.insert(2);
        int value = randomisedSet.getRandom();

        Assertions.assertEquals(2, value);
    }

}