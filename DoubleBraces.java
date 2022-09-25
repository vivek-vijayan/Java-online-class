
class Test {
    public void run() {
        System.out.println("Running...");
    }
}

public class DoubleBraces {
    public static void main(String[] args) {
        // Double braces initialisation
        new Test() { // initialise
            { // anonymous class
                run();
            }
        };

    }
}
