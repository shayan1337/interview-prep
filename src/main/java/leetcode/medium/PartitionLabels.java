package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 763. Partition Labels (https://leetcode.com/problems/partition-labels/)
 */
public class PartitionLabels {

    public static List<Integer> partitionLabels(String S) {
        int[] lastIndices = new int[26];

        for (int i = 0; i < S.length(); i++) {
            lastIndices[S.charAt(i) - 'a'] = i;
        }

        List<Integer> list = new ArrayList<>();
        int index = 0;

        while (index < S.length()) {
            int current = index + 1;
            int end = lastIndices[S.charAt(index) - 'a'];

            while (current < S.length() && current < end) {
                if (lastIndices[S.charAt(current) - 'a'] > end)
                    end = lastIndices[S.charAt(current) - 'a'];
                current++;
            }
            list.add(end - index + 1);
            index = end + 1;
        }
        return list;
    }
}
