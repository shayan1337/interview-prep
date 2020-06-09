package leetcode.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 227. Basic Calculator II (https://leetcode.com/problems/basic-calculator-ii/)
 */
public class BasicCalculatorII {

    public static int calculate(String s) {
        List<String> list = preprocess(s);

        Stack<String> numbers = new Stack<>();
        Stack<String> operators = new Stack<>();
        int index = list.size() - 1;

        while (index >= 0) {
            String current = list.get(index);

            if (current.equals("+") || current.equals("-")) {

                if (!operators.isEmpty() && (operators.peek().equals("*") || operators.peek().equals("/"))) {

                    int res = Integer.parseInt(numbers.pop());

                    while(!operators.isEmpty() && (operators.peek().equals("*") || operators.peek().equals("/"))) {
                        String operator = operators.pop();

                        if(operator.equals("/"))
                            res /= Integer.parseInt(numbers.pop());
                        else
                            res *= Integer.parseInt(numbers.pop());
                    }
                    numbers.push(Integer.toString(res));
                }
                operators.push(current);
            }

            else if (current.equals("*") || current.equals("/"))
                operators.push(current);

            else
                numbers.push(current);
            index--;
        }

        int res = Integer.parseInt(numbers.pop());
        while(!operators.isEmpty()) {
            String operator = operators.pop();

            switch (operator) {
                case "+":
                    res += Integer.parseInt(numbers.pop());
                    break;
                case "-":
                    res -= Integer.parseInt(numbers.pop());
                    break;
                case "*":
                    res *= Integer.parseInt(numbers.pop());
                    break;
                case "/":
                    res /= Integer.parseInt(numbers.pop());
                    break;
            }

        }
        return res;
    }

    private static List<String> preprocess(String s) {
        List<String> list = new ArrayList<>();
        int index = 0;

        int val = 0;
        while(index < s.length()) {
            char c = s.charAt(index);

            if (c == ' ') {
                index++;
                continue;
            }

            if (Character.isDigit(c)) {
                val = (int)(val * Math.pow(10, 1)) + c - '0';
            }

            else {
                list.add(Integer.toString(val));
                val = 0;
                list.add(Character.toString(c));
            }
            index++;
        }
        list.add(Integer.toString(val));
        return list;
    }
}
