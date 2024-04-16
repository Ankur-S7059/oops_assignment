// Define a class that implements the Runnable interface
class MyRunnable implements Runnable {
    // Implement the run() method to specify the code that the thread will execute
    public void run() {
        // This code will be executed when the thread is started
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread running: " + i);
        }
    }
}   

public class ThreadRunnableDisplay {
    public static void main(String[] args) {
        // Create an instance of the MyRunnable class
        MyRunnable myRunnable = new MyRunnable();
        // Create a Thread object with MyRunnable instance as parameter
        Thread thread = new Thread(myRunnable);
        // Start the thread
        thread.start();
        
    }
}
