public class ExceptionDemo {

    public static void main(String[] args) {
        // Block 1: Generate NegativeArraySizeException
        try {
            // Trying to create an array with a negative size
            int size = -5;
            int[] arr = new int[size];  // This will throw NegativeArraySizeException
        } catch (NegativeArraySizeException e) {
            // Catching the NegativeArraySizeException
            System.out.println("Caught NegativeArraySizeException: " + e.getMessage());
        }

        // Block 2: Generate ArithmeticException
        try {
            // Trying to divide by zero
            int a = 10;
            int b = 0;
            int result = a / b;  // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            // Catching the ArithmeticException
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }
}
