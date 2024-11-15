public class NumberPattern2 {

    public static void main(String[] args) {
        // Outer loop for the number of rows (in this case, 4 rows)
        for (int row = 1; row <= 4; row++) {
            
            // First part: Print spaces for alignment
            for (int space = 1; space <= 4 - row; space++) {
                System.out.print(" ");
            }
            
            // Second part: Print decreasing numbers from the current row number down to 1
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            
            // Third part: Print increasing numbers from 2 up to the current row number
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            
            // Move to the next line after each row
            System.out.println();
        }
    }
}
