package leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinaryInLLToIntegerTest {

    @Test
    void test() {
        ListNode node = new ListNode(1);
        node.next = new ListNode(0);
        node.next.next = new ListNode(1);

        int result = BinaryInLLToInteger.getDecimalValueOptimised(node);

        Assertions.assertEquals(5, result);
    }

}