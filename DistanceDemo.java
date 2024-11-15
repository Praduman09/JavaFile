// Base class Distance
class Distance {
    // Instance variable to store the distance in miles
    protected double miles;

    // Constructor to initialize the distance in miles
    public Distance(double miles) {
        this.miles = miles;
    }

    // Method to calculate and display travel time (in hours) at a speed of 60 miles per hour
    public void travelTime() {
        double speed = 60; // Speed in miles per hour
        double time = miles / speed; // Time = distance / speed
        System.out.println("Time taken to cover " + miles + " miles at 60 miles per hour: " + time + " hours.");
    }
}

// Derived class DistanceMKS that inherits from Distance
class DistanceMKS extends Distance {

    // Constructor to initialize the distance in miles (but the derived class will work with kilometers)
    public DistanceMKS(double miles) {
        super(miles); // Call the parent class constructor to initialize miles
    }

    // Override the travelTime method to calculate time assuming distance in kilometers
    @Override
    public void travelTime() {
        // Convert miles to kilometers (1 mile = 1.60934 kilometers)
        double kilometers = miles * 1.60934;

        // Speed is 100 kilometers per second
        double speed = 100; // Speed in kilometers per second
        
        // Calculate time in seconds (time = distance / speed)
        double timeInSeconds = kilometers / speed;

        // Convert time from seconds to hours for easier understanding
        double timeInHours = timeInSeconds / 3600; // 1 hour = 3600 seconds

        // Display the time taken
        System.out.println("Time taken to cover " + kilometers + " kilometers at 100 kilometers per second: " + timeInHours + " hours.");
    }
}

// Main class to test the working of the classes
public class DistanceDemo {

    public static void main(String[] args) {
        // Create an object of Distance class (distance in miles)
        Distance distanceInMiles = new Distance(120);
        // Call the travelTime method for the Distance class (miles and speed 60 mph)
        distanceInMiles.travelTime();

        System.out.println("\n---------------------------------\n");

        // Create an object of DistanceMKS class (distance in miles)
        DistanceMKS distanceInKilometers = new DistanceMKS(120);
        // Call the travelTime method for the DistanceMKS class (kilometers and speed 100 km/s)
        distanceInKilometers.travelTime();
    }
}
