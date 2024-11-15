import java.util.Scanner;

public class AlternateNumbers {

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

        // Print every alternate number from the array
        printAlternateNumbers(numbers);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }

    // Method to print every alternate number in the array
    public static void printAlternateNumbers(int[] numbers) {
        System.out.println("Every alternate number in the array:");
        
        // Loop through the array and print every alternate number
        for (int i = 0; i < numbers.length; i += 2) {
            System.out.print(numbers[i] + " ");
        }
    }
}
