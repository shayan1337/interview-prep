package leetcode.easy;

/**
 * 392. Is Subsequence (https://leetcode.com/problems/is-subsequence/)
 */
public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;

        while (j < t.length() && i < s.length()) {
            if (t.charAt(j) == s.charAt(i))
                i++;
            j++;
        }

        return i == s.length();
    }
}
