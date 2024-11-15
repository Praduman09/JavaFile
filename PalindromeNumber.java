import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Call the method to check if the number is palindrome
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        // Store the original number to compare later
        int originalNumber = number;
        int reversedNumber = 0;

        // Reverse the number
        while (number != 0) {
            int lastDigit = number % 10;          // Get the last digit
            reversedNumber = reversedNumber * 10 + lastDigit;  // Build the reversed number
            number = number / 10;                 // Remove the last digit from the number
        }

        // If the reversed number is equal to the original number, it is a palindrome
        return originalNumber == reversedNumber;
    }
}
