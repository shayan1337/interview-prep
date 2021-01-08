package leetcode.medium;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 937. Reorder Data in Log Files (https://leetcode.com/problems/reorder-data-in-log-files/)
 */
public class ReorderDataInLogFiles {

    public String[] reorderLogFiles(String[] logs) {
        if (logs == null || logs.length == 0)
            return new String[]{};

        List<String> digitLogs = new ArrayList<>();
        List<String> letterLogs = new ArrayList<>();

        for(String log : logs) {
            if (isDigitLog(log))
                digitLogs.add(log);
            else
                letterLogs.add(log);
        }

        sortLetterLogs(letterLogs);
        letterLogs.addAll(digitLogs);

        String[] res = new String[logs.length];
        int index = 0;
        while(index < res.length) {
            res[index] = letterLogs.get(index);
            index++;
        }

        return res;
    }

    private void sortLetterLogs(List<String> letterLogs) {
        letterLogs.sort((a,b) -> {
            int order = a.substring(a.indexOf(" ")).compareTo(b.substring(b.indexOf(" ")));
            if (order == 0)
                return a.substring(0, a.indexOf(" ")).compareTo(b.substring(0, b.indexOf(" ")));
            return order;
        });
    }

    private boolean isDigitLog(String log) {
        return Character.isDigit(log.split(" ")[1].charAt(0));
    }
}
