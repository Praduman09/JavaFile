import java.util.HashMap;

// Custom exception class
class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}

public class CountryCapital {

    // Method to get the capital of a country
    public static void printCapital(String country) throws NoMatchFoundException {
        // HashMap to store country and capital
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("India", "New Delhi");
        capitals.put("USA", "Washington D.C.");
        capitals.put("Japan", "Tokyo");
        capitals.put("France", "Paris");
        capitals.put("Germany", "Berlin");
        capitals.put("Australia", "Canberra");

        // Check if country is in the map
        if (capitals.containsKey(country)) {
            System.out.println("The capital of " + country + " is " + capitals.get(country));
        } else {
            throw new NoMatchFoundException("No capital found for country: " + country);
        }
    }

    public static void main(String[] args) {
        // Check if a country was provided as input
        if (args.length < 1) {
            System.out.println("Please enter a country name.");
            return;
        }

        // Get the country name from command line argument
        String country = args[0];

        try {
            // Call method to print capital of the country
            printCapital(country);
        } catch (NoMatchFoundException e) {
            // Catch and print custom exception message
            System.out.println(e.getMessage());
        }
    }
}
