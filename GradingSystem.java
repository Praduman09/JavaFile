import java.util.Scanner;

public class GradingSystem {

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the percentage
        System.out.print("Enter the percentage: ");
        double percentage = scanner.nextDouble();

        // Determine the grade based on the percentage
        if (percentage >= 90) {
            System.out.println("Grade A");
        } else if (percentage >= 80) {
            System.out.println("Grade B");
        } else if (percentage >= 70) {
            System.out.println("Grade C");
        } else if (percentage >= 60) {
            System.out.println("Grade D");
        } else if (percentage >= 40) {
            System.out.println("Grade E");
        } else {
            System.out.println("Grade F");
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}

