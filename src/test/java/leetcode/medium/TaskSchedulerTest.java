package leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaskSchedulerTest {

    @Test
    void testTaskScheduler1() {
        int res = TaskScheduler.leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 2);
        Assertions.assertEquals(8, res);
    }

    @Test
    void testTaskScheduler2() {
        int res = TaskScheduler.leastInterval(new char[]{'A','B','C','D','E','A','B','C','D','E'}, 4);
        Assertions.assertEquals(10, res);
    }
}