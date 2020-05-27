package ctci.dp;

/**
 * A child is running up a stair with N steps and can hop either 1, 2 or 3 steps at a time. How many possible ways the child can run up the stairs?
 */
public class TripleStep {

    public static int numberOfWays(int N) {
        if (N < 0)
            return 0;

        if (N == 0)
            return 1;

        return numberOfWays(N-1) + numberOfWays(N-2) + numberOfWays(N-3);
    }

    public static int numberOfWaysMemoized(int N) {
        int[] memo = new int[N + 1];
        return numberOfWaysMemoized(N, memo);
    }

    private static int numberOfWaysMemoized(int N, int[] memo) {
        if (N < 0)
            return 0;
        if (N == 0)
            return 1;

        if (memo[N] != 0)
            return memo[N];

        memo[N] = numberOfWaysMemoized(N-1, memo)
                + numberOfWaysMemoized(N-2, memo)
                + numberOfWaysMemoized(N-3, memo);

        return memo[N];
    }
}
