import java.util.Scanner;

class Employee {
    // Instance variables
    private int emp_id;
    private String emp_name;
    private double basic_salary;
    
    // Constructor to initialize Employee object
    public Employee(int emp_id, String emp_name, double basic_salary) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.basic_salary = basic_salary;
    }

    // Method to calculate and return gross salary
    public double calculateGrossSalary() {
        double hra = 0.20 * basic_salary; // 20% of basic salary
        double da = 0.10 * basic_salary;  // 10% of basic salary
        return basic_salary + hra + da;   // Gross salary
    }

    // Method to display employee details along with the gross salary
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Basic Salary: " + basic_salary);
        System.out.println("Gross Salary: " + calculateGrossSalary());
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Input employee details
        System.out.print("Enter Employee ID: ");
        int emp_id = scanner.nextInt();
        
        // Clear the buffer after reading an integer
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter Employee Name: ");
        String emp_name = scanner.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basic_salary = scanner.nextDouble();

        // Create an Employee object using the provided details
        Employee employee = new Employee(emp_id, emp_name, basic_salary);

        // Display the employee details and gross salary
        employee.displayEmployeeDetails();

        // Close the scanner object
        scanner.close();
    }
}
