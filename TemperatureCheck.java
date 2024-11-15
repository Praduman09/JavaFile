// Custom Exception for TooHot
class TooHot extends Exception {
    public TooHot(String message) {
        super(message);
    }
}

// Custom Exception for TooCold
class TooCold extends Exception {
    public TooCold(String message) {
        super(message);
    }
}

public class TemperatureCheck {

    // Method to check the temperature and handle exceptions
    public static void checkTemperature(double temperature) throws TooHot, TooCold {
        if (temperature > 35) {
            throw new TooHot("Temperature is too hot! It exceeds 35°C.");
        } else if (temperature < 5) {
            throw new TooCold("Temperature is too cold! It is below 5°C.");
        } else {
            System.out.println("Normal temperature.");
            // Convert Celsius to Fahrenheit
            double fahrenheit = (temperature * 9/5) + 32;
            System.out.println("The temperature in Fahrenheit is: " + fahrenheit);
        }
    }

    public static void main(String[] args) {
        // Check if a command line argument is provided
        if (args.length < 1) {
            System.out.println("Please enter a temperature value.");
            return;
        }

        try {
            // Parse the input temperature from the command line argument
            double temperature = Double.parseDouble(args[0]);
            
            // Call the method to check the temperature
            checkTemperature(temperature);
        } catch (TooHot e) {
            System.out.println(e.getMessage());
        } catch (TooCold e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid numeric temperature.");
        }
    }
}
