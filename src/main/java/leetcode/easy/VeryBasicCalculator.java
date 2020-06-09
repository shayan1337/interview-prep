package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a valid arithmetic expression with '+' and '-' only, evaluate the result
 */
public class VeryBasicCalculator {

    public static int calculate(String s) {
        List<String> list = preprocess(s);

        int index = 0;

        int res = Integer.parseInt(list.get(index++));

        while(index < list.size()) {
            String operator = list.get(index++);

            switch (operator) {
                case "+":
                    res += Integer.parseInt(list.get(index++));
                    break;
                case "-":
                    res -= Integer.parseInt(list.get(index++));
                    break;
                case "*":
                    res *= Integer.parseInt(list.get(index++));
                    break;
                case "/":
                    res /= Integer.parseInt(list.get(index++));
                    break;
            }
        }
        return res;
    }

    /* preprocess the string removing whitespaces and extracting multiple digit numbers */
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
