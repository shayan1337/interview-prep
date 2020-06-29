package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReversePolishNotationTest {

    @Test
    void testRPN_1() {
        int res = ReversePolishNotation.evalRPN(new String[]{"2", "1", "+", "3", "*"});

        assertEquals(9, res);
    }

    @Test
    void testRPN_2() {
        int res = ReversePolishNotation.evalRPN(new String[]{"4", "13", "5", "/", "+"});

        assertEquals(6, res);
    }

    @Test
    void testRPN_3() {
        int res = ReversePolishNotation.evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"});

        assertEquals(22, res);
    }

}