class Person {

    // Instance variables
    private String name;
    private int age;

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;  // Initialize the 'name' field with the value passed as argument
        this.age = age;    // Initialize the 'age' field with the value passed as argument
    }

    // Method to display object details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ParameterizedConstructorExample {

    public static void main(String[] args) {
        // Create objects using the parameterized constructor
        Person person1 = new Person("John Doe", 25);
        Person person2 = new Person("Alice Smith", 30);

        // Display the details of the objects
        person1.display();
        person2.display();
    }
}
