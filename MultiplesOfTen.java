import java.util.Scanner;

public class MultiplesOfTen {

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the lower and upper bounds of the interval
        System.out.print("Enter the lower bound of the interval: ");
        int lowerBound = scanner.nextInt();

        System.out.print("Enter the upper bound of the interval: ");
        int upperBound = scanner.nextInt();

        // Check if the lower bound is greater than the upper bound
        if (lowerBound > upperBound) {
            System.out.println("The lower bound cannot be greater than the upper bound.");
        } else {
            System.out.println("Multiples of 10 between " + lowerBound + " and " + upperBound + " are:");

            // Start from the nearest multiple of 10 that is greater than or equal to the lower bound
            int start = (lowerBound % 10 == 0) ? lowerBound : (lowerBound + (10 - lowerBound % 10));

            // Loop through the interval and print multiples of 10
            for (int i = start; i <= upperBound; i += 10) {
                System.out.print(i + " ");
            }
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
