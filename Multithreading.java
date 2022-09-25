import java.util.Scanner;

// Runnable interface --------- THREAD 1
class MyThreadWithInput implements Runnable {
    int x;

    void getdata() {
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
    }

    public void run() {
        getdata();
        System.out.println("Running from my thread with the input..");
    }
}

// Runnable interface ------------- THREAD 2
class MyThread2 implements Runnable {
    public void run() {
        System.out.println("Running from my thread.");
    }
}

public class Multithreading {

    void showName() {
        System.out.println("Showing my name");
    }

    public static void main(String[] args) {
        Thread t = new Thread(new MyThread2());  /// 1
        t.start();
        Thread t1 = new Thread(new MyThread2());  /// 2
        t1.start();
        Thread t2 = new Thread(new MyThreadWithInput());
        t2.start();
        Thread t3 = new Thread(new MyThread2());  ///3
        t3.start();
        Thread t4 = new Thread(new MyThread2()); //// 4
        t4.start();
    }
}
