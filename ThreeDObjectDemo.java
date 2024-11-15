import java.util.Scanner;

// Base class representing a general 3D object
abstract class ThreeDObject {
    // Abstract methods to be overridden in subclasses
    public abstract double wholeSurfaceArea();
    public abstract double volume();
}

// Derived class representing a Box
class Box extends ThreeDObject {
    private double length, width, height;

    // Constructor
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Override method to calculate surface area of the box
    @Override
    public double wholeSurfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }

    // Override method to calculate volume of the box
    @Override
    public double volume() {
        return length * width * height;
    }
}

// Derived class representing a Cube (special case of a Box)
class Cube extends Box {

    // Constructor for Cube (all sides are equal)
    public Cube(double side) {
        super(side, side, side); // Calls the constructor of the Box class
    }

    // Cube has the same methods for surface area and volume as Box, inherited from Box
}

// Derived class representing a Cylinder
class Cylinder extends ThreeDObject {
    private double radius, height;

    // Constructor
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Override method to calculate surface area of the cylinder
    @Override
    public double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    // Override method to calculate volume of the cylinder
    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

// Derived class representing a Cone
class Cone extends ThreeDObject {
    private double radius, height;

    // Constructor
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Override method to calculate surface area of the cone
    @Override
    public double wholeSurfaceArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    }

    // Override method to calculate volume of the cone
    @Override
    public double volume() {
        return (1.0 / 3) * Math.PI * radius * radius * height;
    }
}

public class ThreeDObjectDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Box
        System.out.println("Enter dimensions for the Box:");
        System.out.print("Length: ");
        double length = scanner.nextDouble();
        System.out.print("Width: ");
        double width = scanner.nextDouble();
        System.out.print("Height: ");
        double height = scanner.nextDouble();
        Box box = new Box(length, width, height);

        // Cube
        System.out.println("Enter the side length for the Cube:");
        double side = scanner.nextDouble();
        Cube cube = new Cube(side);

        // Cylinder
        System.out.println("Enter dimensions for the Cylinder:");
        System.out.print("Radius: ");
        double radiusCylinder = scanner.nextDouble();
        System.out.print("Height: ");
        double heightCylinder = scanner.nextDouble();
        Cylinder cylinder = new Cylinder(radiusCylinder, heightCylinder);

        // Cone
        System.out.println("Enter dimensions for the Cone:");
        System.out.print("Radius: ");
        double radiusCone = scanner.nextDouble();
        System.out.print("Height: ");
        double heightCone = scanner.nextDouble();
        Cone cone = new Cone(radiusCone, heightCone);

        // Display results for all objects
        System.out.println("\nBox:");
        System.out.println("Surface Area: " + box.wholeSurfaceArea());
        System.out.println("Volume: " + box.volume());

        System.out.println("\nCube:");
        System.out.println("Surface Area: " + cube.wholeSurfaceArea());
        System.out.println("Volume: " + cube.volume());

        System.out.println("\nCylinder:");
        System.out.println("Surface Area: " + cylinder.wholeSurfaceArea());
        System.out.println("Volume: " + cylinder.volume());

        System.out.println("\nCone:");
        System.out.println("Surface Area: " + cone.wholeSurfaceArea());
        System.out.println("Volume: " + cone.volume());
    }
}
