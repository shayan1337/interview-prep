package leetcode.medium;


/**
 * 528. Random Pick with Weight (https://leetcode.com/problems/random-pick-with-weight/)
 */
public class RandomPickWithWeight {
    private int[] sumOfWeights;

    public RandomPickWithWeight(int[] w) {
        int sum = 0;

        sumOfWeights = new int[w.length];

        for(int i=0; i<sumOfWeights.length; i++) {
            sum += w[i];
            sumOfWeights[i] = sum;
        }
    }

    public int pickIndex() {
        double target = sumOfWeights[sumOfWeights.length - 1] * Math.random();
        return search(target);
    }

    private int search(double randomNumber) {
        int i = 0;

        for (; i < sumOfWeights.length; ++i) {
            if (randomNumber < sumOfWeights[i])
                return i;
        }

        return i;
    }
}
