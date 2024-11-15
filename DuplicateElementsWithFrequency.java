import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateElementsWithFrequency {

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

        // Find and display the duplicate elements and their frequencies
        findAndPrintDuplicates(numbers);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }

    // Method to find and print duplicate elements with their frequency
    public static void findAndPrintDuplicates(int[] numbers) {
        // Use a HashMap to store the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Traverse the array and count the frequency of each element
        for (int num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Print the duplicate elements and their frequencies
        System.out.println("Duplicate elements and their frequency:");

        boolean foundDuplicates = false;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Element: " + entry.getKey() + ", Frequency: " + entry.getValue());
                foundDuplicates = true;
            }
        }

        if (!foundDuplicates) {
            System.out.println("No duplicates found.");
        }
    }
}
