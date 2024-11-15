import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the range (a positive integer)
        System.out.print("Enter the range (a positive integer): ");
        int range = scanner.nextInt();

        // Validate the input to make sure it's positive
        if (range < 1) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Calculate the sum of natural numbers up to the given range
            int sum = 0;
            for (int i = 1; i <= range; i++) {
                sum += i;
            }

            // Output the result
            System.out.println("The sum of natural numbers up to " + range + " is: " + sum);
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}

