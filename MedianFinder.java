import java.util.Arrays;
import java.util.Scanner;

public class MedianFinder {

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the size of the array
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Create an array to store the numbers
        int[] numbers = new int[n];

        // Ask the user to input the numbers
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Call the method to calculate the median
        double median = findMedian(numbers);

        // Output the result
        System.out.println("The median is: " + median);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }

    // Method to find the median
    public static double findMedian(int[] numbers) {
        // Sort the array in ascending order
        Arrays.sort(numbers);

        int n = numbers.length;
        
        // If the number of elements is odd, return the middle element
        if (n % 2 != 0) {
            return numbers[n / 2];
        } else {
            // If the number of elements is even, return the average of the two middle elements
            return (numbers[(n / 2) - 1] + numbers[n / 2]) / 2.0;
        }
    }
}
