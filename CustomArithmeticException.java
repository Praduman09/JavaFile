// Custom exception class to handle Arithmetic exceptions
class ArithmeticErrorException extends Exception {
    public ArithmeticErrorException(String message) {
        super(message);
    }
}

public class CustomArithmeticException {

    // Method to perform arithmetic operations
    public static int calculateEquation(int a, int b, String operator) throws ArithmeticErrorException {
        int result = 0;

        // Try-catch block for handling different arithmetic exceptions
        try {
            switch (operator) {
                case "+":
                    result = a + b;
                    break;

                case "-":
                    result = a - b;
                    break;

                case "*":
                    result = a * b;
                    // Checking for overflow (for large multiplication results)
                    if (a != 0 && result / a != b) {
                        throw new ArithmeticErrorException("Overflow occurred during multiplication");
                    }
                    break;

                case "/":
                    if (b == 0) {
                        // Division by zero
                        throw new ArithmeticErrorException("Division by zero is not allowed");
                    }
                    result = a / b;
                    break;

                default:
                    throw new ArithmeticErrorException("Invalid operator");
            }
        } catch (ArithmeticException e) {
            // This catch block is to handle any ArithmeticException
            throw new ArithmeticErrorException("Arithmetic error: " + e.getMessage());
        }

        return result;
    }

    public static void main(String[] args) {
        // Test the custom exception for different cases
        int a = 10, b = 0;

        try {
            // Trying division by zero
            System.out.println("Result: " + calculateEquation(a, b, "/"));
        } catch (ArithmeticErrorException e) {
            System.out.println(e.getMessage());
        }

        // Trying multiplication that may result in overflow
        a = Integer.MAX_VALUE;
        b = 2;
        try {
            System.out.println("Result: " + calculateEquation(a, b, "*"));
        } catch (ArithmeticErrorException e) {
            System.out.println(e.getMessage());
        }

        // Testing addition and subtraction
        try {
            System.out.println("Result: " + calculateEquation(a, b, "+"));
            System.out.println("Result: " + calculateEquation(a, b, "-"));
        } catch (ArithmeticErrorException e) {
            System.out.println(e.getMessage());
        }
    }
}
