import java.util.concurrent.Semaphore;

public class ReaderWriterProblem {
    private static int readers = 0;
    private static Semaphore resourceLock = new Semaphore(1);
    private static Semaphore readCountLock = new Semaphore(1);

    public static void main(String[] args) {
        Runnable readerTask = () -> {
            try {
                readCountLock.acquire();
                readers++;
                if (readers == 1) {
                    resourceLock.acquire(); // First reader locks resource
                }
                readCountLock.release();

                System.out.println(Thread.currentThread().getName() + " is reading.");
                Thread.sleep(500); // Simulate reading

                readCountLock.acquire();
                readers--;
                if (readers == 0) {
                    resourceLock.release(); // Last reader releases resource
                }
                readCountLock.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable writerTask = () -> {
            try {
                resourceLock.acquire(); // Writer locks resource
                System.out.println(Thread.currentThread().getName() + " is writing.");
                Thread.sleep(1000); // Simulate writing
                resourceLock.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread[] threads = new Thread[6];
        for (int i = 0; i < 3; i++) {
            threads[i] = new Thread(readerTask, "Reader " + i);
        }
        for (int i = 3; i < 6; i++) {
            threads[i] = new Thread(writerTask, "Writer " + (i - 3));
        }

        for (Thread t : threads) {
            t.start();
        }
    }
}
