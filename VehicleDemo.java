// Vehicle class
class Vehicle {
    // Protected instance variables
    protected String regnNumber;
    protected double speed;
    protected String color;
    protected String ownerName;

    // Constructor to initialize the Vehicle
    public Vehicle(String regnNumber, double speed, String color, String ownerName) {
        this.regnNumber = regnNumber;
        this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;
    }

    // Method to display basic vehicle data
    public void showData() {
        System.out.println("This is a vehicle class.");
    }
}

// Bus class inheriting Vehicle
class Bus extends Vehicle {
    // Private instance variable for Bus
    private int routeNumber;

    // Constructor to initialize Bus details
    public Bus(String regnNumber, double speed, String color, String ownerName, int routeNumber) {
        super(regnNumber, speed, color, ownerName);  // Call the constructor of the Vehicle class
        this.routeNumber = routeNumber;
    }

    // Override the showData method to include Bus details
    @Override
    public void showData() {
        super.showData();  // Call the parent class showData method
        System.out.println("Vehicle Type: Bus");
        System.out.println("Registration Number: " + regnNumber);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Route Number: " + routeNumber);
    }
}

// Car class inheriting Vehicle
class Car extends Vehicle {
    // Private instance variable for Car
    private String manufacturerName;

    // Constructor to initialize Car details
    public Car(String regnNumber, double speed, String color, String ownerName, String manufacturerName) {
        super(regnNumber, speed, color, ownerName);  // Call the constructor of the Vehicle class
        this.manufacturerName = manufacturerName;
    }

    // Override the showData method to include Car details
    @Override
    public void showData() {
        super.showData();  // Call the parent class showData method
        System.out.println("Vehicle Type: Car");
        System.out.println("Registration Number: " + regnNumber);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Manufacturer Name: " + manufacturerName);
    }
}

// Main class to test the functionality
public class VehicleDemo {

    public static void main(String[] args) {
        // Create a Bus object
        Bus bus = new Bus("KA01-1234", 60, "Yellow", "John Doe", 42);
        System.out.println("Bus Details:");
        bus.showData();  // Display Bus details

        System.out.println("\n--------------------------------\n");

        // Create a Car object
        Car car = new Car("MH12-5678", 120, "Red", "Jane Smith", "Toyota");
        System.out.println("Car Details:");
        car.showData();  // Display Car details
    }
}
