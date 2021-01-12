package leetcode.medium;

/**
 * 186. Reverse Words in a String II (https://leetcode.com/problems/reverse-words-in-a-string-ii/)
 */
public class ReverseWordsII {

    public static void reverseWords(char[] s) {
        int left = 0;
        int right = s.length - 1;

        //reverse the entire array
        while (left < right) {
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;

            left++;
            right--;
        }

        //reverse word in an array
        int start = 0;

        while (start < s.length) {

            int end = start;

            while (end < s.length && s[end] != ' ')
                end++;

            // reverse word
            int wordStart = start;
            int wordEnd = end - 1;

            while (wordStart < wordEnd) {
                char tmp = s[wordStart];
                s[wordStart] = s[wordEnd];
                s[wordEnd] = tmp;

                wordStart++;
                wordEnd--;
            }

            start = end + 1;
        }
    }
}
