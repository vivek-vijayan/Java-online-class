class AnotherClass {
    void run() {
        System.out.println("Running from another class..");
    }
}

// Main class
public class Polymorphism extends AnotherClass {
    void run2() {
        System.out.println("RUnning from main class");
    }

    public static void main(String[] args) {

        // Data binding - Dynamic
        AnotherClass a = new Polymorphism();
        a.run();
    }

}
