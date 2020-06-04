package leetcode.medium;


import java.util.*;

/**
 * 17. Letter Combinations of a Phone Number (https://leetcode.com/problems/letter-combinations-of-a-phone-number/)
 */
public class LetterCombinationsOfAPhoneNumber {

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0)
            return new ArrayList<>();

        Map<Character, List<Character>> map = new HashMap<>();

        map.put('2', Arrays.asList('a','b','c'));
        map.put('3', Arrays.asList('d','e','f'));
        map.put('4', Arrays.asList('g','h','i'));
        map.put('5', Arrays.asList('j','k','l'));
        map.put('6', Arrays.asList('m','n','o'));
        map.put('7', Arrays.asList('p','q','r','s'));
        map.put('8', Arrays.asList('t','u','v'));
        map.put('9', Arrays.asList('w','x','y','z'));

        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        letterCombinations(map, digits, res, sb, 0);
        return res;
    }

    private void letterCombinations(Map<Character, List<Character>> map, String digits, List<String> res, StringBuilder sb, int index) {
        if (index == digits.length()) {
            res.add(sb.toString());
            return;
        }

        for(char ch : map.get(digits.charAt(index))) {
            sb.append(ch);
            letterCombinations(map, digits, res, sb, index + 1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
