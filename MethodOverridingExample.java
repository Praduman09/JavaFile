// Superclass (Parent class)
class Animal {

    // Method in the superclass
    public void sound() {
        System.out.println("The animal makes a sound.");
    }
}

// Subclass (Child class) that overrides the sound method
class Dog extends Animal {

    // Overriding the sound method to provide specific behavior for Dog
    @Override
    public void sound() {
        System.out.println("The dog barks.");
    }
}

// Another subclass (Child class) that overrides the sound method
class Cat extends Animal {

    // Overriding the sound method to provide specific behavior for Cat
    @Override
    public void sound() {
        System.out.println("The cat meows.");
    }
}

public class MethodOverridingExample {

    public static void main(String[] args) {
        // Create objects of Animal, Dog, and Cat classes
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();  // Dog object but referred by Animal type
        Animal myCat = new Cat();  // Cat object but referred by Animal type

        // Call the sound method on each object
        System.out.println("Animal:");
        myAnimal.sound();  // Calls the sound method from Animal class

        System.out.println("\nDog:");
        myDog.sound();     // Calls the overridden sound method from Dog class

        System.out.println("\nCat:");
        myCat.sound();     // Calls the overridden sound method from Cat class
    }
}
