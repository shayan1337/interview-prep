package leetcode.hard;


/**
 * 273. Integer to English Words (https://leetcode.com/problems/integer-to-english-words/)
 */
public class IntegerToEnglishWords {

    public static String numberToWords(int num) {
        if (num == 0)
            return "Zero";

        String[] thousands = {"", "Thousand", "Million", "Billion"};

        String integer = Integer.toString(num);
        int index = integer.length() - 1;
        int thousand = -1;
        int i = 1;
        StringBuilder partitionedSb = new StringBuilder();
        String result = "";

        while (index >= 0) {
            partitionedSb.append(integer.charAt(index));

            if (i % 3 == 0) {
                String partitionedNumAsString
                        = getPartitionedNumAsString(partitionedSb.reverse());

                thousand++;

                if (partitionedNumAsString.length() > 0) {
                    partitionedNumAsString = partitionedNumAsString + " " + thousands[thousand];
                }

                result = partitionedNumAsString + " " + result;

                result = result.trim();

                partitionedSb = new StringBuilder();
            }

            index--;
            i++;
        }

        if (partitionedSb.length() != 0) {
            String partitionedNumAsString
                    = getPartitionedNumAsString(partitionedSb.reverse());
            thousand++;

            if (partitionedNumAsString.length() > 0) {
                partitionedNumAsString = partitionedNumAsString + " " + thousands[thousand];
            }

            result = partitionedNumAsString +
                    " " +
                    result;
        }

        return result.trim();
    }

    private static String getPartitionedNumAsString(StringBuilder partitionedSb) {
        String[] ones = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] hundreds = {"", "One Hundred", "Two Hundred", "Three Hundred", "Four Hundred", "Five Hundred", "Six Hundred", "Seven Hundred", "Eight Hundred", "Nine Hundred"};

        if (partitionedSb.length() == 1) {
            return ones[Integer.parseInt(String.valueOf(partitionedSb.charAt(0)))];
        }

        if (partitionedSb.length() == 2) {
            return getString(partitionedSb, ones, 0, 2);
        }

        String hundred = hundreds[Integer.parseInt(String.valueOf(partitionedSb.charAt(0)))];
        return (hundred +
                " " +
                getString(partitionedSb, ones, 1, 3))
                .trim();
    }

    private static String getString(StringBuilder partitionedSb, String[] ones, int start, int end) {
        String[] outliers = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        int value = Integer.parseInt(String.valueOf(partitionedSb.substring(start, end)));
        if (value >= 10 && value <= 19) {
            return outliers[value % 10];
        }

        String sb = tens[value / 10] +
                " " +
                ones[value % 10];
        return sb.trim();
    }
}
