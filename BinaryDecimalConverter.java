import java.util.Scanner;

public class BinaryDecimalConverter {

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Display the menu for conversion options
        System.out.println("Choose an option:");
        System.out.println("1. Binary to Decimal");
        System.out.println("2. Decimal to Binary");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        // Perform the appropriate conversion based on user choice
        if (choice == 1) {
            System.out.print("Enter a binary number: ");
            String binaryNumber = scanner.next();
            // Convert binary to decimal
            int decimal = binaryToDecimal(binaryNumber);
            System.out.println("The decimal equivalent of binary " + binaryNumber + " is: " + decimal);
        } else if (choice == 2) {
            System.out.print("Enter a decimal number: ");
            int decimalNumber = scanner.nextInt();
            // Convert decimal to binary
            String binary = decimalToBinary(decimalNumber);
            System.out.println("The binary equivalent of decimal " + decimalNumber + " is: " + binary);
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }

    // Method to convert binary to decimal
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int length = binary.length();
        
        // Convert the binary string to decimal
        for (int i = 0; i < length; i++) {
            // Get each character (digit) from the binary string
            char digit = binary.charAt(i);
            // If the digit is '1', add the corresponding power of 2 to decimal
            if (digit == '1') {
                decimal += Math.pow(2, length - 1 - i);
            }
        }
        return decimal;
    }

    // Method to convert decimal to binary
    public static String decimalToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();
        
        // Convert the decimal number to binary
        while (decimal > 0) {
            // Append the remainder (either 0 or 1) to the binary string
            binary.insert(0, decimal % 2);
            decimal /= 2;  // Divide the number by 2 for the next iteration
        }
        
        return binary.toString();
    }
}
