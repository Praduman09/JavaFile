// Custom Exception for Username being too short
class UsernameTooShortException extends Exception {
    public UsernameTooShortException(String message) {
        super(message);
    }
}

// Custom Exception for Password mismatch
class PasswordMismatchException extends Exception {
    public PasswordMismatchException(String message) {
        super(message);
    }
}

public class UserValidation {

    // Method to validate username and password
    public static void validateUser(String username, String password) throws UsernameTooShortException, PasswordMismatchException {
        // Predefined correct password
        String correctPassword = "password123";
        
        // Check if username is too short
        if (username.length() < 6) {
            throw new UsernameTooShortException("Username is too short! It must be at least 6 characters.");
        }

        // Check if the password matches the correct password
        if (!password.equals(correctPassword)) {
            throw new PasswordMismatchException("Password does not match.");
        }

        // If both username and password are valid
        System.out.println("User validated successfully!");
    }

    public static void main(String[] args) {
        // Create a Scanner object for input
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Take username and password input
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Try to validate the username and password
        try {
            validateUser(username, password);
        } catch (UsernameTooShortException e) {
            System.out.println(e.getMessage());
        } catch (PasswordMismatchException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
