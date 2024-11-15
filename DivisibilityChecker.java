import java.util.Scanner;

public class DivisibilityChecker {

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number and divisor
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        // Check if the number is divisible by the divisor
        if (divisor != 0) {
            if (number % divisor == 0) {
                System.out.println(number + " is divisible by " + divisor);
            } else {
                System.out.println(number + " is not divisible by " + divisor);
            }
        } else {
            System.out.println("Divisor cannot be zero.");
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
