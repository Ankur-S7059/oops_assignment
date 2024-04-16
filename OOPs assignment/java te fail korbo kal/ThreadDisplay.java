// Define a class that extends Thread
class MyThread extends Thread {
    // Override the run() method to specify the code that the thread will execute9
    public void run() {
        // This code will be executed when the thread is started
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread running: " + i);
        }
    }
}

public class ThreadDisplay {
    public static void main(String[] args) {
        // Create an instance of the MyThread class
        MyThread thread = new MyThread();
        // Start the thread
        thread.start();
    }
}
