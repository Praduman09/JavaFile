class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers (method overloading)
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two floating-point numbers (method overloading with different parameter type)
    public double add(double a, double b) {
        return a + b;
    }

    // Method to add a string and an integer (method overloading with different parameter type)
    public String add(String a, int b) {
        return a + b;
    }
}

public class MethodOverloadingExample {

    public static void main(String[] args) {
        // Create an object of the Calculator class
        Calculator calc = new Calculator();

        // Calling the add method with two integers
        System.out.println("Sum of 5 and 10: " + calc.add(5, 10));

        // Calling the add method with three integers
        System.out.println("Sum of 1, 2, and 3: " + calc.add(1, 2, 3));

        // Calling the add method with two double values
        System.out.println("Sum of 3.5 and 4.5: " + calc.add(3.5, 4.5));

        // Calling the add method with a string and an integer
        System.out.println("Concatenation of 'Hello' and 5: " + calc.add("Hello", 5));
    }
}
