package leetcode.medium;

import java.util.Stack;

/**
 * 150. Evaluate Reverse Polish Notation (https://leetcode.com/problems/evaluate-reverse-polish-notation/)
 */
public class ReversePolishNotation {

    public static int evalRPN(String[] tokens) {
        if (tokens == null || tokens.length == 0)
            return 0;

        Stack<String> stack = new Stack<>();

        for(String s : tokens) {

            if (!isOperator(s))
                stack.push(s);

            else {
                int n1 = Integer.parseInt(stack.pop());
                int n2 = Integer.parseInt(stack.pop());

                switch (s) {
                    case "+" :
                        stack.push(String.valueOf(n2 + n1));
                        break;

                    case "-" :
                        stack.push(String.valueOf(n2 - n1));
                        break;

                    case "*" :
                        stack.push(String.valueOf(n2 * n1));
                        break;

                    case "/" :
                        stack.push(String.valueOf((int)(n2 / n1)));
                        break;

                    default:
                        break;
                }
            }
        }
        return Integer.parseInt(stack.pop());
    }

    private static boolean isOperator(String s) {
        return ( s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") );
    }
}
