// Define Interface1
interface Interface1 {
    void methodA();
    void methodB();
}

// Define Interface2
interface Interface2 {
    void methodC();
    void methodD();
}

// Define Interface3
interface Interface3 {
    void methodE();
    void methodF();
}

// New Interface inherits from Interface1, Interface2, and Interface3
interface NewInterface extends Interface1, Interface2, Interface3 {
    void methodG();  // New method
}

// Concrete class implementing NewInterface and inheriting from a concrete class
class ConcreteClass {
    // Concrete class can have its own methods as well
    public void concreteMethod() {
        System.out.println("This is a concrete class method.");
    }
}

// Class MyClass implements the NewInterface
class MyClass extends ConcreteClass implements NewInterface {

    // Implementing methodA from Interface1
    public void methodA() {
        System.out.println("methodA() from Interface1");
    }

    // Implementing methodB from Interface1
    public void methodB() {
        System.out.println("methodB() from Interface1");
    }

    // Implementing methodC from Interface2
    public void methodC() {
        System.out.println("methodC() from Interface2");
    }

    // Implementing methodD from Interface2
    public void methodD() {
        System.out.println("methodD() from Interface2");
    }

    // Implementing methodE from Interface3
    public void methodE() {
        System.out.println("methodE() from Interface3");
    }

    // Implementing methodF from Interface3
    public void methodF() {
        System.out.println("methodF() from Interface3");
    }

    // Implementing the new method from NewInterface
    public void methodG() {
        System.out.println("methodG() from NewInterface");
    }
}

// Main class to test the program
public class InterfaceDemo {

    // Methods that take each interface as an argument
    public static void testInterface1(Interface1 i1) {
        i1.methodA();
        i1.methodB();
    }

    public static void testInterface2(Interface2 i2) {
        i2.methodC();
        i2.methodD();
    }

    public static void testInterface3(Interface3 i3) {
        i3.methodE();
        i3.methodF();
    }

    public static void testNewInterface(NewInterface ni) {
        ni.methodA();
        ni.methodB();
        ni.methodC();
        ni.methodD();
        ni.methodE();
        ni.methodF();
        ni.methodG();
    }

    public static void main(String[] args) {
        // Create an object of MyClass
        MyClass obj = new MyClass();
        
        // Pass the object to each of the methods
        System.out.println("Testing Interface1:");
        testInterface1(obj);  // Testing Interface1
        
        System.out.println("\nTesting Interface2:");
        testInterface2(obj);  // Testing Interface2
        
        System.out.println("\nTesting Interface3:");
        testInterface3(obj);  // Testing Interface3
        
        System.out.println("\nTesting NewInterface:");
        testNewInterface(obj);  // Testing NewInterface
    }
}
