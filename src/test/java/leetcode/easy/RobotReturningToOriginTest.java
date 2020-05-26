package leetcode.easy;

import leetcode.easy.RobotReturningToOrigin;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RobotReturningToOriginTest {

    @Test
    void testJudgeCircleWhenRobotDoesntMove() {
        Assertions.assertTrue(RobotReturningToOrigin.judgeCircle(""));
    }

    @Test
    void testJudgeCircleReturnsFalse() {
        Assertions.assertFalse(RobotReturningToOrigin.judgeCircle("LL"));
    }

    @Test
    void testJudgeCircleReturnsTrue() {
        Assertions.assertTrue(RobotReturningToOrigin.judgeCircle("LRUD"));
    }

}