import java.util.Scanner;

public class MaxOfThreeNumbers {

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Determine the maximum of the three numbers
        int max = num1; // Assume num1 is the largest initially

        if (num2 > max) {
            max = num2; // Update max if num2 is larger
        }

        if (num3 > max) {
            max = num3; // Update max if num3 is larger
        }

        // Output the result
        System.out.println("The maximum of the three numbers is: " + max);

        // Close the scanner
        scanner.close();
    }
}

