// Superclass (Parent class)
class Animal {

    // Static method in the Animal class
    public static void sound() {
        System.out.println("The animal makes a generic sound.");
    }
}

// Subclass (Child class) that hides the static method of Animal
class Dog extends Animal {

    // Static method in the Dog class (method hiding)
    public static void sound() {
        System.out.println("The dog barks.");
    }
}

public class MethodHidingExample {

    public static void main(String[] args) {
        // Static methods are called based on the reference type

        // Calling the static method using class name (no objects created)
        Animal.sound();   // Calls Animal's sound method
        Dog.sound();      // Calls Dog's sound method (method hiding)

        // Calling the static method using object reference (not recommended for static methods)
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();

        myAnimal.sound();  // Calls Animal's sound method (because reference is of type Animal)
        myDog.sound();     // Calls Animal's sound method (because reference is of type Animal, not Dog)
    }
}
