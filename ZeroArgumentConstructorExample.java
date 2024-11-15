class MyClass {

    // Instance variables
    private String name;
    private int age;

    // Zero-argument constructor
    public MyClass() {
        // Initialize default values
        name = "Unknown";
        age = 0;
    }

    // Method to display object details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ZeroArgumentConstructorExample {

    public static void main(String[] args) {
        // Create an object of MyClass using the zero-argument constructor
        MyClass obj = new MyClass();

        // Call the display method to show the default values
        obj.display();
    }
}
