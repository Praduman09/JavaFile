import java.util.Scanner;

public class HCF {

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Call the function to calculate HCF
        int hcf = findHCF(num1, num2);

        // Output the result
        System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + hcf);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }

    // Function to find HCF using Euclidean Algorithm
    public static int findHCF(int a, int b) {
        // Applying the Euclidean algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;  // Remainder when a is divided by b
            a = temp;   // Update a to be the previous b
        }
        return a; // The HCF is stored in a after the loop
    }
}
