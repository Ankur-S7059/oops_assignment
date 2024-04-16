class Counter {
    private int count = 0;

    // Method to increment the count
    public void increment() {
        synchronized (this) { // Synchronize on the current instance of Counter
            count++;
            System.out.println(Thread.currentThread().getName() + ": Incremented count to " + count);
        }
    }
}

class MyThread extends Thread {
    private Counter counter;

    public MyThread(String name, Counter counter) {
        super(name);
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            counter.increment();
            try {
                Thread.sleep(100); // Sleep for 100 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class SyncronizedBlock_threadCode {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Create two threads sharing the same Counter object
        MyThread thread1 = new MyThread("Thread 1", counter);
        MyThread thread2 = new MyThread("Thread 2", counter);

        // Start both threads
        thread1.start();
        thread2.start();
    }
}
