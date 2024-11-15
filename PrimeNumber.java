import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Call the method to check if the number is prime
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        // Handle special cases
        if (number <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        if (number == 2) {
            return true; // 2 is a prime number
        }

        // Check divisibility from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // If divisible by any number, it's not prime
            }
        }
        return true; // If no divisors are found, it's prime
    }
}
