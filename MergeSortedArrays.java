import java.util.Arrays;

public class MergeSortedArrays {

    public static void main(String[] args) {
        // Example input arrays A and B, already sorted in ascending order
        int[] A = {1, 3, 5, 7};
        int[] B = {2, 4, 6, 8};

        // Call the mergeArrays method to merge A and B into C
        int[] C = mergeArrays(A, B);

        // Print the merged array
        System.out.println("Merged Sorted Array: " + Arrays.toString(C));
    }

    // Method to merge two sorted arrays A and B into a single sorted array C
    public static int[] mergeArrays(int[] A, int[] B) {
        // Create an array to store the merged result
        int[] C = new int[A.length + B.length];

        int i = 0, j = 0, k = 0;

        // Merge the arrays until one of them is exhausted
        while (i < A.length && j < B.length) {
            if (A[i] <= B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
        }

        // If there are remaining elements in A, add them to C
        while (i < A.length) {
            C[k++] = A[i++];
        }

        // If there are remaining elements in B, add them to C
        while (j < B.length) {
            C[k++] = B[j++];
        }

        return C;
    }
}
