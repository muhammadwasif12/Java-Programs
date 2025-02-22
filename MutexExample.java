class MutexLock {
    private boolean isLocked = false;

    public synchronized void acquire() {
        while (isLocked) {
            try {
                wait(); // Wait for the lock to be released
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isLocked = true; // Lock acquired
    }

    public synchronized void release() {
        isLocked = false; // Lock released
        notify(); // Notify other waiting threads
    }
}

public class MutexExample {
    private static int sharedResource = 0;
    private static MutexLock lock = new MutexLock();

    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                lock.acquire();
                sharedResource++;
                System.out.println(Thread.currentThread().getName() + 
                                   " updated shared resource to " + sharedResource);
                lock.release();
            }
        };

        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");
        t1.start();
        t2.start();
    }
}
