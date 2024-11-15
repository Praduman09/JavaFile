import java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Output before swapping
        System.out.println("Before swapping: ");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        // Swap the numbers using arithmetic operations
        num1 = num1 + num2;  // num1 becomes the sum of num1 and num2
        num2 = num1 - num2;  // num2 is now the original value of num1
        num1 = num1 - num2;  // num1 is now the original value of num2

        // Output after swapping
        System.out.println("After swapping: ");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        // Close the scanner
        scanner.close();
    }
}
