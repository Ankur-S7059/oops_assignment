class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            // Print the thread name and loop count
            System.out.println(Thread.currentThread().getName() + ": " + i);
            // Pause the thread
            Thread.yield();
        }
    }
}
public class YieldThreadCode {
    public static void main(String[] args) {
        // Create two threads
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");

        // Start both threads
        thread1.start();
        thread2.start();
    }
}
