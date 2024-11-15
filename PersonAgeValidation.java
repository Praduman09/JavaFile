// Custom exception class for Negative Age
class NegativeAgeException extends Exception {
    public NegativeAgeException(String message) {
        super(message);
    }
}

public class PersonAgeValidation {

    // Method to check the age and throw an exception if the age is negative
    public static void validateAge(String name, int age) throws NegativeAgeException {
        // If the age is negative, throw the NegativeAgeException
        if (age < 0) {
            throw new NegativeAgeException("Age cannot be negative for " + name);
        } else {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to get user input
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Take name and age as input from the user
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try {
            // Validate the age using the validateAge method
            validateAge(name, age);
        } catch (NegativeAgeException e) {
            // Catch the NegativeAgeException and display the error message
            System.out.println(e.getMessage());
        } finally {
            // Close the scanner to avoid resource leaks
            scanner.close();
        }
    }
}
