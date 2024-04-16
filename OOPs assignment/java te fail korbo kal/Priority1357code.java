class CounterThread extends Thread {
    private static int counter = 0;

    public CounterThread(String name, int priority) {
        super(name);
        setPriority(priority);
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            counter++;
            try {
                Thread.sleep(10); // Sleep for 10 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(getName() + ": Counter value = " + counter);
    }
}

public class Priority1357code {
    public static void main(String[] args) {
        // Create four threads with different priorities
        CounterThread thread1 = new CounterThread("Thread 1", 1);
        CounterThread thread2 = new CounterThread("Thread 2", 3);
        CounterThread thread3 = new CounterThread("Thread 3", 5);
        CounterThread thread4 = new CounterThread("Thread 4", 7);

        // Start all threads
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
