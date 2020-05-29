package ctci.sortandsearch;


/**
 * Given two sorted arrays A and B, where A has a large enough buffer to store B. Write a method to merge B into A in sorted order
 */
public class SortedMerge {

    // Runs in O(AB)
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

    // Runs in O(A + B)
    public static void optimisedSortedMerge(int A[], int[] B, int lastIndexA) {
        int indexA = lastIndexA;
        int indexB = B.length - 1;
        int indexToBeMerged = A.length - 1;

        while(indexToBeMerged >= 0) {
            if (indexA >= 0 && A[indexA] > B[indexB]) {
                A[indexToBeMerged] = A[indexA];
                indexA--;
            } else {
                A[indexToBeMerged] = B[indexB];
                indexB--;
            }
            indexToBeMerged--;
        }
    }
}
