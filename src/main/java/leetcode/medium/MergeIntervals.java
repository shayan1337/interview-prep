package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 56. Merge Intervals (https://leetcode.com/problems/merge-intervals/)
 */
public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        List<Interval> intervalsList = new ArrayList<>();

        for (int[] interval : intervals) {
            intervalsList.add(new Interval(interval[0], interval[1]));
        }

        intervalsList.sort((i1, i2) -> i1.start == i2.start ? i1.end - i2.end : i1.start - i2.start);

        List<Interval> res = new ArrayList<>();
        int i = 0;
        while (i < intervalsList.size()) {
            int start = intervalsList.get(i).start;
            int end = intervalsList.get(i).end;
            int j = i + 1;
            while (j < intervalsList.size() && end >= intervalsList.get(j).start) {
                end = Math.max(end, intervalsList.get(j).end);
                j++;
            }

            res.add(new Interval(start, end));
            i = j;
        }

        int[][] resArr = new int[res.size()][2];
        int index = 0;
        for (Interval in : res) {
            resArr[index][0] = in.start;
            resArr[index][1] = in.end;
            index++;
        }

        return resArr;
    }
}

class Interval {
    int start;
    int end;

    Interval(int s, int e) {
        start = s;
        end = e;
    }
}
