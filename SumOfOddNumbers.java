import java.util.Scanner;

public class SumOfOddNumbers {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the number of elements in the array
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Create an array to store the elements
        int[] numbers = new int[n];

        // Ask the user to enter the elements of the array
        System.out.println("Enter the elements:");

        // Read the elements from the user
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Find the sum of all odd numbers in the array
        int sumOfOddNumbers = findSumOfOddNumbers(numbers);

        // Output the result
        System.out.println("The sum of all odd numbers in the array is: " + sumOfOddNumbers);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }

    // Method to find the sum of all odd numbers in the array
    public static int findSumOfOddNumbers(int[] numbers) {
        int sum = 0;

        // Traverse the array and add odd numbers to the sum
        for (int num : numbers) {
            if (num % 2 != 0) {  // Check if the number is odd
                sum += num;  // Add the odd number to the sum
            }
        }

        return sum;  // Return the sum of odd numbers
    }
}
