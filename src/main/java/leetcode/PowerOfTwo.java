package leetcode;


/**
 * 231. Power of Two (https://leetcode.com/problems/power-of-two/)
 */
public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {

        if (n <= 0)
            return false;

        for(int i=0; i<32; i++) {
            double number = Math.pow(2,i);

            if (number == n)
                return true;

            if (number > n)
                return false;
        }
        return false;
    }
}
