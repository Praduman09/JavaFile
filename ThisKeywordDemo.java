// Class demonstrating the use of 'this' keyword
class Person {
    // Instance variables
    private String name;
    private int age;

    // Constructor to initialize instance variables
    public Person(String name, int age) {
        // Using 'this' to refer to instance variables
        this.name = name;   // 'this.name' refers to the instance variable
        this.age = age;     // 'this.age' refers to the instance variable
    }

    // Method to display details using 'this' to refer to current object
    public void displayDetails() {
        System.out.println("Name: " + this.name);   // Using 'this' to refer to current object's instance variable
        System.out.println("Age: " + this.age);     // Using 'this' to refer to current object's instance variable
    }

    // Constructor overloading using 'this' to call another constructor
    public Person(String name) {
        // Calling another constructor in the same class
        this(name, 30);  // Default age is set to 30
    }
}

public class ThisKeywordDemo {
    public static void main(String[] args) {
        // Creating a Person object using the first constructor
        Person person1 = new Person("Alice", 25);
        person1.displayDetails();  // Display details for person1

        System.out.println("\n------------------\n");

        // Creating a Person object using the second constructor (constructor overloading)
        Person person2 = new Person("Bob");
        person2.displayDetails();  // Display details for person2
    }
}
