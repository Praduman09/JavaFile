import java.util.Scanner;

public class MilesToKilometersConverter {

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the distance in miles
        System.out.print("Enter the distance in miles: ");
        double miles = scanner.nextDouble();

        // Conversion factor: 1 mile = 1.60934 kilometers
        double kilometers = miles * 1.60934;

        // Output the result
        System.out.printf("%.2f miles is equal to %.2f kilometers.\n", miles, kilometers);

        // Close the scanner
        scanner.close();
    }
}

