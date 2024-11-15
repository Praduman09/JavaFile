class Rectangle {

    // Instance variables (attributes)
    private double length;
    private double width;

    // Constructor 1: No parameters (default constructor)
    public Rectangle() {
        this.length = 1.0;  // Default value
        this.width = 1.0;   // Default value
        System.out.println("No-argument constructor called");
    }

    // Constructor 2: Two parameters (length and width)
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        System.out.println("Parameterized constructor called");
    }

    // Constructor 3: One parameter (square shape, length = width)
    public Rectangle(double side) {
        this.length = side;
        this.width = side;
        System.out.println("One-argument constructor called (Square)");
    }

    // Method to calculate the area of the rectangle
    public double area() {
        return length * width;
    }

    // Method to display the dimensions of the rectangle
    public void displayDimensions() {
        System.out.println("Length: " + length + ", Width: " + width);
    }
}

public class ConstructorOverloadingExample {

    public static void main(String[] args) {
        // Creating objects using different constructors

        // Using no-argument constructor
        Rectangle rect1 = new Rectangle();
        rect1.displayDimensions();
        System.out.println("Area of rect1: " + rect1.area() + "\n");

        // Using parameterized constructor (2 arguments)
        Rectangle rect2 = new Rectangle(4.5, 7.2);
        rect2.displayDimensions();
        System.out.println("Area of rect2: " + rect2.area() + "\n");

        // Using constructor with one argument (square)
        Rectangle rect3 = new Rectangle(5.0);
        rect3.displayDimensions();
        System.out.println("Area of rect3: " + rect3.area() + "\n");
    }
}
