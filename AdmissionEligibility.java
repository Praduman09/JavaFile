import java.util.Scanner;

public class AdmissionEligibility {

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of students
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        // Loop through each student to check eligibility
        for (int i = 1; i <= n; i++) {
            System.out.println("\nEnter marks for student " + i + ":");

            // Prompt the user to enter marks in three subjects
            System.out.print("Marks in Mathematics: ");
            int mathMarks = scanner.nextInt();

            System.out.print("Marks in Physics: ");
            int physicsMarks = scanner.nextInt();

            System.out.print("Marks in Chemistry: ");
            int chemistryMarks = scanner.nextInt();

            // Calculate the total marks
            int totalMarks = mathMarks + physicsMarks + chemistryMarks;
            int mathPhysicsTotal = mathMarks + physicsMarks;

            // Check eligibility based on the given conditions
            if ((mathMarks >= 60 && physicsMarks >= 50 && chemistryMarks >= 40 && totalMarks >= 200) ||
                (mathPhysicsTotal >= 150)) {
                System.out.println("Student " + i + " is eligible for admission.");
            } else {
                System.out.println("Student " + i + " is not eligible for admission.");
            }
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
