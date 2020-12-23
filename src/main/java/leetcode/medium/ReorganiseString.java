package leetcode.medium;

import java.util.PriorityQueue;

/**
 * 767. Reorganize String (https://leetcode.com/problems/reorganize-string/)
 */
public class ReorganiseString {

    public static String reorganizeString(String S) {
        int[] charCount = new int[26];
        for (char c : S.toCharArray()) {
            charCount[c - 'a']++;
        }

        PriorityQueue<CharacterCount> pq = new PriorityQueue<>((a, b) -> a.count == b.count ? a.letter - b.letter : b.count - a.count);

        for (int i = 0; i < 26; i++) {
            if (charCount[i] > 0) {
                if (charCount[i] > (S.length() + 1) / 2)
                    return "";
                pq.add(new CharacterCount((char) ('a' + i), charCount[i]));
            }
        }

        StringBuilder sb = new StringBuilder();

        while (pq.size() > 1) {
            CharacterCount cc1 = pq.poll();
            CharacterCount cc2 = pq.poll();

            sb.append(cc1.letter);
            sb.append(cc2.letter);

            cc1.count--;
            cc2.count--;

            if (cc1.count > 0)
                pq.add(cc1);
            if (cc2.count > 0)
                pq.add(cc2);
        }

        if (pq.size() > 0)
            sb.append(pq.poll().letter);

        return sb.toString();
    }
}

class CharacterCount {
    char letter;
    int count;

    CharacterCount(char _letter, int _count) {
        letter = _letter;
        count = _count;
    }
}
