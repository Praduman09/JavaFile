import java.util.Scanner;

public class TemperatureConverter {

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for the conversion type
        System.out.println("Temperature Converter");
        System.out.println("Choose the conversion type:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter choice (1 or 2): ");
        int choice = scanner.nextInt();

        // Perform the conversion based on user choice
        if (choice == 1) {
            // Celsius to Fahrenheit conversion
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.printf("%.2f Celsius = %.2f Fahrenheit\n", celsius, fahrenheit);
        } else if (choice == 2) {
            // Fahrenheit to Celsius conversion
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = fahrenheitToCelsius(fahrenheit);
            System.out.printf("%.2f Fahrenheit = %.2f Celsius\n", fahrenheit, celsius);
        } else {
            System.out.println("Invalid choice. Please run the program again and choose 1 or 2.");
        }

        scanner.close();
    }
}
