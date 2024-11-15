public class FactorialCalculator {

    public static void main(String[] args) {
        int number = 12;
        long factorial = 1;

        // Loop to calculate the factorial of 12
        for (int i = 1; i <= number; i++) {
            factorial *= i; // Multiply factorial by the current number
        }

        // Output the result
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
