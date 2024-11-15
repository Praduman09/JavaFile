import java.util.Scanner;
class Commission {
    // Instance variable
    private double sales;

    // Constructor to initialize the sales variable
    public Commission(double sales) {
        this.sales = sales;
    }

    // Method to calculate the commission
    public double commission() {
        if (sales < 0) {
            return -1;  // Return -1 to indicate invalid sales
        }
        // Assume commission is 10% of the sales
        return sales * 0.10;
    }

}
public class CommissionDemo {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the sales value
        System.out.print("Enter the sales amount: ");
        double sales = scanner.nextDouble();

        // Validate the input: Sales should not be negative
        if (sales < 0) {
            System.out.println("Invalid Input");
        } else {
            // Create a Commission object using the valid sales value
            Commission commission = new Commission(sales);

            // Call the commission method to calculate the commission
            double commissionAmount = commission.commission();

            // If the commission method returned -1, print an error message
            if (commissionAmount == -1) {
                System.out.println("Invalid Input");
            } else {
                // Print the commission
                System.out.println("The commission is: " + commissionAmount);
            }
        }

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
