package leetcode.easy;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 136. Single Number (https://leetcode.com/problems/single-number/)
 */
public class SingleNumber {

    public static int singleNumber(int[] nums) {

        HashSet<Integer> set = new HashSet<Integer>();

        for(int n:nums) {
            if (set.contains(n))
                set.remove(n);
            else
                set.add(n);
        }

        Iterator<Integer> it = set.iterator();
        return (int)it.next();
    }
}
