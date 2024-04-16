class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                // Print the thread name and loop count
                System.out.println(Thread.currentThread().getName() + ": " + i);
                // Sleep for 1 second
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class SleepThreadCode{
    public static void main(String[] args) {
        // Create two threads
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");

        // Start both threads
        thread1.start();
        thread2.start();
    }
}
