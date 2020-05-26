package leetcode;

/**
 * 657. Robot Return to Origin (https://leetcode.com/problems/robot-return-to-origin/)
 */
public class RobotReturningToOrigin {
    public static boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for (char move: moves.toCharArray()) {
            if (move == 'U') y--;
            else if (move == 'D') y++;
            else if (move == 'L') x--;
            else if (move == 'R') x++;
        }
        return x == 0 && y == 0;
    }
}
