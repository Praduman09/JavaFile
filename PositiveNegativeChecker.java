import java.util.Scanner;

public class PositiveNegativeChecker {

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // Read the number as an integer

        // Check if the number is positive, negative or zero
        if (number > 0) {
            System.out.println("The number is Positive.");
        } else if (number < 0) {
            System.out.println("The number is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }

        // Close the scanner to prevent memory leaks
        scanner.close();
    }
}

