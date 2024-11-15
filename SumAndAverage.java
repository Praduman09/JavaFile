import java.util.Scanner;

public class SumAndAverage {

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create an array to store the integers
        int[] numbers = new int[n];

        // Ask the user to input the numbers
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Calculate the sum and average of the array
        int sum = calculateSum(numbers);
        double average = calculateAverage(sum, n);

        // Output the results
        System.out.println("The sum of the array elements is: " + sum);
        System.out.println("The average of the array elements is: " + average);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }

    // Method to calculate the sum of the array
    public static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num; // Add each number to the sum
        }
        return sum;
    }

    // Method to calculate the average of the array
    public static double calculateAverage(int sum, int n) {
        return (double) sum / n; // Return the average (cast to double to handle floating-point division)
    }
}
