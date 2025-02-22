import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    private static Semaphore semaphore = new Semaphore(2); // Allow 2 threads
    private static int sharedResource = 0;

    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                semaphore.acquire();
                System.out.println(Thread.currentThread().getName() + " entered critical section.");
                sharedResource++;
                System.out.println(Thread.currentThread().getName() + " updated shared resource to " + sharedResource);
                Thread.sleep(500); // Simulating work
                semaphore.release();
                System.out.println(Thread.currentThread().getName() + " exited critical section.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");
        Thread t3 = new Thread(task, "Thread 3");
        Thread t4 = new Thread(task, "Thread 4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
