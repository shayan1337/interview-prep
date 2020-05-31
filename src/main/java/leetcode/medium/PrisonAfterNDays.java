package leetcode.medium;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 957. Prison Cells After N Days (https://leetcode.com/problems/prison-cells-after-n-days/)
 */
public class PrisonAfterNDays {

    public static int[] prisonAfterNDays(int[] cells, int N) {
        Map<Integer, int[]> map = new HashMap<>();
        int days = N;

        while (days-- > 0) {

            int[] nextDay = new int[8];

            for (int i = 1; i < 7; i++) {
                nextDay[i] = cells[i - 1] == cells[i + 1] ? 1 : 0;
            }

            int[] first = map.getOrDefault(1, null);

            if (first != null) {
                if (Arrays.equals(nextDay, first)) {
                    if (N % (N - days - 1) == 0)
                        return cells;
                    break;
                }
            }

            map.put(N - days, nextDay);
            cells = nextDay;
        }
        return days == -1 ? cells : map.get(N % (N - days - 1));
    }
}
