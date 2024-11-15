import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of terms in the Fibonacci series
        System.out.print("Enter the number of terms for Fibonacci series: ");
        int terms = scanner.nextInt();

        // Print the Fibonacci series
        System.out.print("Fibonacci Series: ");

        // First two terms of the Fibonacci series
        int first = 0, second = 1;

        // Loop to print the Fibonacci series
        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");
            // Compute the next term in the series
            int nextTerm = first + second;
            first = second;
            second = nextTerm;
        }

        // Close the scanner
        scanner.close();
    }
}
