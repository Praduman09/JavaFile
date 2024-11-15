// Custom exception class
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class ExceptionHandlingDemo {

    // Method that throws an exception
    public static void checkNumber(int number) throws CustomException {
        if (number < 0) {
            throw new CustomException("Number cannot be negative");
        } else {
            System.out.println("Valid number: " + number);
        }
    }

    public static void main(String[] args) {
        // Example of try-catch-finally block
        try {
            // Simulating some code that may throw an exception
            System.out.println("In the try block");
            int result = 10 / 0; // This will throw an ArithmeticException (division by zero)
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        } finally {
            // This block will always execute
            System.out.println("This is the finally block, executed no matter what");
        }

        // Example of method throwing a custom exception
        try {
            System.out.println("\nCalling method that throws CustomException");
            checkNumber(-5); // This will throw the custom exception
        } catch (CustomException e) {
            System.out.println("CustomException caught: " + e.getMessage());
        }

        // Example of throws keyword in method declaration
        try {
            System.out.println("\nCalling method that throws checked exception");
            throwCheckedException();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught: " + e.getMessage());
        }

        // Example of throw keyword used to throw an exception explicitly
        try {
            System.out.println("\nExplicitly throwing an exception");
            throw new Exception("This is a manually thrown exception");
        } catch (Exception e) {
            System.out.println("Caught manually thrown exception: " + e.getMessage());
        }
    }

    // Method that declares throws
    public static void throwCheckedException() throws InterruptedException {
        Thread.sleep(1000); // This can throw InterruptedException
    }
}
