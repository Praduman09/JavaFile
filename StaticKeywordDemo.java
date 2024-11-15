class Employee {
    // Static variable, shared by all instances
    static int employeeCount = 0;  // Static variable to keep track of the number of employees

    // Instance variables
    private String empName;
    private int empId;

    // Constructor
    public Employee(String empName, int empId) {
        this.empName = empName;
        this.empId = empId;
        employeeCount++;  // Increment static variable each time an Employee object is created
    }

    // Static method to get the number of employees
    public static int getEmployeeCount() {
        return employeeCount;
    }

    // Instance method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
    }

    // Static block to initialize some data when the class is loaded
    static {
        System.out.println("Employee class is loaded and static block is executed.");
    }
}

public class StaticKeywordDemo {
    public static void main(String[] args) {
        // Static block is executed when the class is loaded
        System.out.println("Program started.");

        // Creating Employee objects
        Employee emp1 = new Employee("Alice", 101);
        Employee emp2 = new Employee("Bob", 102);
        
        // Displaying details of the employees
        emp1.displayDetails();
        emp2.displayDetails();

        // Displaying the total number of employees using the static method
        System.out.println("Total number of employees: " + Employee.getEmployeeCount());

        // Static variable can also be accessed directly without creating an object
        System.out.println("Employee count (without object): " + Employee.employeeCount);

        System.out.println("Program ended.");
    }
}
