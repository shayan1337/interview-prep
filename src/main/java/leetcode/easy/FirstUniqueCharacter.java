package leetcode.easy;

import java.util.HashMap;

/**
 * 387. First Unique Character in a String (https://leetcode.com/problems/first-unique-character-in-a-string/)
 */

public class FirstUniqueCharacter {
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();

        for(char c : s.toCharArray()) {
            int charCount = count.containsKey(c) ? count.get(c) : 0;
            count.put(c, charCount + 1);
        }

        for(int i=0; i<s.length(); i++) {
            if (count.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
}
