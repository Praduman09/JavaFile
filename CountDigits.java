import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Call the method to count the digits and output the result
        int digitCount = countDigits(number);
        System.out.println("The number of digits in " + number + " is: " + digitCount);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }

    // Method to count the number of digits in an integer
    public static int countDigits(int number) {
        // Handle negative numbers by converting them to positive
        number = Math.abs(number);
        
        // If the number is 0, it has 1 digit
        if (number == 0) {
            return 1;
        }

        // Count the digits using a while loop
        int count = 0;
        while (number > 0) {
            number /= 10;  // Divide the number by 10 to remove the last digit
            count++;       // Increment the digit count
        }
        return count;
    }
}
