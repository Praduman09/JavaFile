import java.util.Scanner;

public class ConsecutiveSum {

    public static void main(String[] args) {
        // Scanner to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Read the input number as a string
        System.out.print("Enter a number: ");
        String number = scanner.nextLine();
        
        // Variable to store the sum of consecutive numbers
        int sum = 0;
        
        // Loop to form numbers by consecutive digits
        for (int i = 0; i < number.length() - 1; i++) {
            // Form the number by concatenating two consecutive digits
            int num = Integer.parseInt(number.substring(i, i + 2));
            sum += num;
        }
        
        // Output the result
        System.out.println("Sum of consecutive numbers: " + sum);
        
        // Close the scanner
        scanner.close();
    }
}
