
class NewThread implements Runnable {
    public void run() {
        System.out.println("Running from the Thread....");
    }
}

// main method
public class NewMultiThreading {
    public static void main(String[] args) {
        Thread t1 = new Thread(new NewThread());
        t1.start(); // 10s

        Thread t2 = new Thread(new NewThread());
        t2.start(); // 30s
    }
}
