package leetcode.easy;

import java.util.*;

/**
 * 819. Most Common Word (https://leetcode.com/problems/most-common-word/)
 */
public class MostCommonWord {

    public static String mostCommonWord(String paragraph, String[] banned) {

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < paragraph.length(); i++) {
            char c = paragraph.charAt(i);

            if (!((c >= 65 && c <= 90) || (c >= 97 && c <=123)))
                c = ' ';
            sb.append(Character.toLowerCase(c));
        }

        Set<String> set = new HashSet<>(Arrays.asList(banned));

        StringBuilder word = new StringBuilder();
        Map<String, Integer> countMap = new HashMap<>();

        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);

            if (c != ' ')
                word.append(c);

            if (c == ' ' && word.length() > 0) {
                String string = word.toString();
                if (!set.contains(string)) {
                    countMap.put(string, countMap.getOrDefault(string, 0) + 1);
                }
                word = new StringBuilder();
            }
        }

        if (word.length() > 0) {
            String string = word.toString();
            if (!set.contains(string)) {
                countMap.put(string, countMap.getOrDefault(string, 0) + 1);
            }
        }

        int max = Integer.MIN_VALUE;
        String res = "";
        for(String w : countMap.keySet()) {
            if (countMap.get(w) > max) {
                max = countMap.get(w);
                res = w;
            }
        }
        return res;
    }
}
