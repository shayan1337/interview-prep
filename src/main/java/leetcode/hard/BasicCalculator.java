package leetcode.hard;

import java.util.Stack;

/**
 * 224. Basic Calculator (https://leetcode.com/problems/basic-calculator/)
 * For guidance (https://www.youtube.com/watch?v=vEcBD6xZCJI)
 */
public class BasicCalculator {

    public static int calculate(String s) {
        Stack<String> stack = new Stack<>();
        int index = s.length() - 1;

        while (index >= 0) {
            char c = s.charAt(index);

            if (Character.isDigit(c)) {
                StringBuilder sb = new StringBuilder();
                sb.append(c);
                while (index - 1 >= 0 && Character.isDigit(s.charAt(index - 1))) {
                    index--;
                    sb.insert(0, s.charAt(index));
                }
                stack.push(sb.toString());
            } else if (c == '(') {

                int res = evaluate(stack);
                stack.pop();
                stack.push(Integer.toString(res));

            } else {
                if (c != ' ')
                    stack.push(Character.toString(c));
            }

            index--;
        }

        return evaluate(stack);
    }

    private static int evaluate(Stack<String> stack) {
        int res = 0;
        if (!stack.isEmpty())
            res = Integer.parseInt(stack.pop());

        while (!stack.isEmpty() && !stack.peek().equals(")")) {
            String operator = stack.pop();

            if (operator.equals("+"))
                res += Integer.parseInt(stack.pop());
            else
                res -= Integer.parseInt(stack.pop());
        }
        return res;
    }
}
