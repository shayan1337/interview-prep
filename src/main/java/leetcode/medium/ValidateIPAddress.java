package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 468. Validate IP Address (https://leetcode.com/problems/validate-ip-address/)
 */
public class ValidateIPAddress {

    public static String validIPAddress(String IP) {
        if (IP == null || IP.length() == 0)
            return "Neither";

        if (IP.indexOf('.') != -1)
            return validateIpV4(IP);
        return validateIpV6(IP);
    }

    private static List<String> split(String s, char c) {
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        int index = 0;

        while(index < s.length()) {
            char ch = s.charAt(index);

            if (ch == c) {
                list.add(sb.toString());
                sb.delete(0, s.length());
            } else
                sb.append(ch);
            index++;
        }

        list.add(sb.toString());
        return list;
    }

    private static String validateIpV4(String ipv4) {
        List<String> numbers = split( ipv4, '.');

        if(numbers.size() != 4)
            return "Neither";

        for(String number : numbers) {
            if (number.length() == 0 || number.length() > 3)
                return "Neither";

            int i = 0;
            while(i < number.length()) {
                if(!Character.isDigit(number.charAt(i)))
                    return "Neither";
                i++;
            }

            int ip = Integer.parseInt(number);
            if ( (number.startsWith("0") && number.length() > 1) || ip > 255 )
                return "Neither";
        }
        return "IPv4";
    }

    private static String validateIpV6(String ipv6) {
        List<String> hex = split(ipv6, ':');
        if (hex.size() != 8)
            return "Neither";

        for(String h : hex) {
            h = h.toUpperCase();

            if (h.length() == 0 || h.length() > 4)
                return "Neither";

            int index = 0;
            while(index < h.length()) {
                char ch = h.charAt(index);
                if (!Character.isDigit(ch) && (ch < 65 || ch > 70))
                    return "Neither";

                index++;
            }
        }

        return "IPv6";
    }
}
