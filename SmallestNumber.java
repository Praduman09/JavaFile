import java.util.Scanner;

public class SmallestNumber {

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

        // Find the smallest number in the array
        int smallest = findSmallest(numbers);

        // Output the result
        System.out.println("The smallest number in the array is: " + smallest);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }

    // Method to find the smallest number in the array
    public static int findSmallest(int[] numbers) {
        int smallest = numbers[0];  // Assume the first element is the smallest

        // Traverse the array to find the smallest element
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];  // Update smallest if a smaller element is found
            }
        }

        return smallest;  // Return the smallest number found
    }
}
