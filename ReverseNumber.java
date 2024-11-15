import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Variable to store the reversed number
        int reversed = 0;

        // Loop to reverse the number
        while (number != 0) {
            int digit = number % 10;  // Get the last digit of the number
            reversed = reversed * 10 + digit;  // Append the digit to the reversed number
            number /= 10;  // Remove the last digit from the number
        }

        // Output the reversed number
        System.out.println("Reversed number: " + reversed);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
