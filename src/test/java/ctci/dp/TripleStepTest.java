package ctci.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TripleStepTest {

    @Test
    void testNumberOfWaysForN_Equals0() {
        Assertions.assertEquals(1, TripleStep.numberOfWays(0));
    }

    @Test
    void testNumberOfWaysForN_Equals1() {
        Assertions.assertEquals(1, TripleStep.numberOfWays(1));
    }

    @Test
    void testNumberOfWaysForN_Equals2() {
        Assertions.assertEquals(2, TripleStep.numberOfWays(2));
    }

    @Test
    void testNumberOfWaysForN_Equals3() {
        Assertions.assertEquals(4, TripleStep.numberOfWays(3));
    }

    @Test
    void testNumberOfWaysMemoForN_Equals0() {
        Assertions.assertEquals(1, TripleStep.numberOfWaysMemoized(0));
    }

    @Test
    void testNumberOfWaysMemoForN_Equals1() {
        Assertions.assertEquals(1, TripleStep.numberOfWaysMemoized(1));
    }

    @Test
    void testNumberOfWaysMemoForN_Equals2() {
        Assertions.assertEquals(2, TripleStep.numberOfWaysMemoized(2));
    }

    @Test
    void testNumberOfWaysMemoForN_Equals3() {
        Assertions.assertEquals(4, TripleStep.numberOfWaysMemoized(3));
    }

}