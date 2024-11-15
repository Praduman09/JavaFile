// Base class Num
class Num {
    // Instance variable to store the number
    protected int number;

    // Constructor to initialize the number
    public Num(int number) {
        this.number = number;
    }

    // Method to display the number
    public void showNum() {
        System.out.println("The number is: " + number);
    }
}

// Derived class HexNum that inherits from Num
class HexNum extends Num {

    // Constructor to initialize the number in HexNum
    public HexNum(int number) {
        super(number); // Calling the parent class constructor
    }

    // Overriding the showNum method to display hexadecimal and octal values
    @Override
    public void showNum() {
        // Calling the parent class showNum method to display the original number
        super.showNum();
        
        // Display the number in hexadecimal and octal formats
        System.out.println("The hexadecimal value is: " + Integer.toHexString(number).toUpperCase());
        System.out.println("The octal value is: " + Integer.toOctalString(number));
    }
}

// Main class to test the functionality
public class NumberDemo {

    public static void main(String[] args) {
        // Create an object of HexNum class with a number
        HexNum hexNum = new HexNum(255);

        // Call the overridden showNum method to display the number, hexadecimal, and octal values
        hexNum.showNum();
    }
}
