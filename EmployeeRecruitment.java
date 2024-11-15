// Custom exception for TooOlder
class TooOlder extends Exception {
    public TooOlder(String message) {
        super(message);
    }
}

// Custom exception for TooYounger
class TooYounger extends Exception {
    public TooYounger(String message) {
        super(message);
    }
}

public class EmployeeRecruitment {

    // Method to check the candidate's eligibility based on age
    public static void checkEligibility(String name, int age) throws TooOlder, TooYounger {
        if (age > 45) {
            throw new TooOlder("Candidate " + name + " is too old! Age is greater than 45.");
        } else if (age < 20) {
            throw new TooYounger("Candidate " + name + " is too young! Age is less than 20.");
        } else {
            System.out.println("Candidate " + name + " is Eligible.");
        }
    }

    public static void main(String[] args) {
        // Accepting name and age from user input
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter candidate name: ");
        String name = scanner.nextLine();

        System.out.print("Enter candidate age: ");
        int age = scanner.nextInt();

        // Try-catch block to handle the exceptions
        try {
            checkEligibility(name, age);
        } catch (TooOlder e) {
            System.out.println(e.getMessage());
        } catch (TooYounger e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
