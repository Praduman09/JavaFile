// Parent class (Base class)
class Animal {
    // Instance variables
    private String name;
    private int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display animal's information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Method to simulate the animal's sound
    public void sound() {
        System.out.println("The animal makes a sound");
    }
}

// Child class (Derived class) that inherits from Animal
class Dog extends Animal {
    private String breed;

    // Constructor of the Dog class
    public Dog(String name, int age, String breed) {
        // Call the parent class constructor using super()
        super(name, age);
        this.breed = breed;
    }

    // Overridden method to make a dog-specific sound
    @Override
    public void sound() {
        System.out.println("The dog barks");
    }

    // Method to display dog's specific information
    public void displayBreed() {
        System.out.println("Breed: " + breed);
    }
}

public class InheritanceExample {

    public static void main(String[] args) {
        // Create an object of the parent class (Animal)
        Animal animal = new Animal("Generic Animal", 5);
        System.out.println("Animal Info:");
        animal.displayInfo();
        animal.sound();
        System.out.println();

        // Create an object of the child class (Dog)
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        System.out.println("Dog Info:");
        dog.displayInfo();   // Inherited from Animal
        dog.displayBreed();   // Specific to Dog
        dog.sound();          // Overridden method from Dog class
    }
}
