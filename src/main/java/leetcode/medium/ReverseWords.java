package leetcode.medium;

import java.util.Stack;

/**
 * 151. Reverse Words in a String (https://leetcode.com/problems/reverse-words-in-a-string/)
 */
public class ReverseWords {

    public static String reverseWords(String s) {
        if (s == null || s.length() == 0)
            return "";

        Stack<String> stack = new Stack<>();
        s = s.trim();
        String[] words = s.split(" ");

        for (String word : words) {
            if (!word.equals(""))
                stack.push(word);
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop()).append(" ");
        }

        return sb.toString().trim();
    }
}
