// Base class
class Person {
    // Instance variables for Person
    protected String name;
    protected int age;

    // Constructor to initialize Person
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Derived class Employee that inherits from Person
class Employee extends Person {
    // Instance variables for Employee
    protected String jobTitle;
    protected double salary;

    // Constructor to initialize Employee, calls constructor of Person
    public Employee(String name, int age, String jobTitle, double salary) {
        super(name, age); // Call the constructor of Person class
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        // Call the method from Person class
        displayPersonDetails();
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
    }
}

// Derived class Manager that inherits from Employee
class Manager extends Employee {
    // Instance variable for Manager
    private String department;

    // Constructor to initialize Manager, calls constructor of Employee
    public Manager(String name, int age, String jobTitle, double salary, String department) {
        super(name, age, jobTitle, salary); // Call the constructor of Employee class
        this.department = department;
    }

    // Method to display manager details
    public void displayManagerDetails() {
        // Call the method from Employee class
        displayEmployeeDetails();
        System.out.println("Department: " + department);
    }
}

// Main class to test the multilevel inheritance
public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        // Create an object of Manager class
        Manager manager = new Manager("John Doe", 35, "Project Manager", 80000.0, "IT");

        // Call the method to display manager details
        manager.displayManagerDetails();
    }
}
