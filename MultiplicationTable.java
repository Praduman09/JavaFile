import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number for which the multiplication table will be generated
        System.out.print("Enter a number to generate its multiplication table: ");
        int number = scanner.nextInt();

        // Prompt the user to enter the range for the multiplication table
        System.out.print("Enter the range (e.g., 10 for 1 to 10): ");
        int range = scanner.nextInt();

        // Generate and print the multiplication table
        System.out.println("Multiplication table of " + number + ":");
        for (int i = 1; i <= range; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}

