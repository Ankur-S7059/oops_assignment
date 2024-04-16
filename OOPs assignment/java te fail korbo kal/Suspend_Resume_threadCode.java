class MyThread extends Thread {
    private boolean suspended = false;

    public MyThread(String name) {
        super(name);
    }

    public synchronized void suspendThread() {
        suspended = true;
    }

    public synchronized void resumeThread() {
        suspended = false;
        notify(); // Notify any waiting threads that the thread has resumed
    }

    public void run() {
        System.out.println(getName() + " starting.");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(getName() + ": " + i);
                Thread.sleep(500); // Sleep for 500 milliseconds
                synchronized (this) {
                    while (suspended) {
                        wait(); // If suspended, wait until resumeThread() is called
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted.");
        }
        System.out.println(getName() + " exiting.");
    }
}

public class Suspend_Resume_threadCode {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");

        thread1.start();
        thread2.start();

        try {
            Thread.sleep(2000); // Main thread sleeps for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Suspend Thread 1 for a while
        thread1.suspendThread();
        System.out.println("Thread 1 suspended.");

        try {
            Thread.sleep(2000); // Main thread sleeps for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Resume Thread 1
        thread1.resumeThread();
        System.out.println("Thread 1 resumed.");

        // Wait for threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread exiting.");
    }
}
