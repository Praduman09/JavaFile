public class NumberPattern {

    public static void main(String[] args) {
        int start = 1; // The first number to print

        // Outer loop for the number of rows (in this case, 3 rows)
        for (int row = 1; row <= 3; row++) {
            // Inner loop for printing numbers in each row
            for (int col = 1; col <= (2 * row - 1); col++) {
                System.out.print(start + " "); // Print the current number
                start++; // Increment the number
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
