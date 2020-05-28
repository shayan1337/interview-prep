package ctci.sortandsearch;


/**
 * Given two sorted arrays A and B, where A has a large enough buffer to store B. Write a method to merge B into A in sorted order
 */
public class SortedMerge {

    // TODO do in O(A+B) instead of O(AB)
    public static void sortedMerge(int A[], int[] B, int lastIndexA) {

        for(int b : B) {
            int indexA = lastIndexA;
            while(indexA >= 0 && b < A[indexA]) {
                A[indexA + 1] = A[indexA];
                A[indexA] = b;
                indexA--;
            }
            lastIndexA++;
        }
    }
}
