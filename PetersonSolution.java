public class PetersonSolution {
    static volatile boolean[] flag = new boolean[2];
    static volatile int turn;
    static volatile int sharedResource = 0;

    static class Process extends Thread {
        int id;

        Process(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) { // Loop 5 times for demonstration
                // Entry section
                flag[id] = true;
                turn = 1 - id;
                while (flag[1 - id] && turn == 1 - id) {
                    // Busy wait
                }

                // Critical section
                sharedResource++;
                System.out.println("Process " + id + " updated shared resource to " + sharedResource);

                // Exit section
                flag[id] = false;

                try {
                    Thread.sleep(500); // Delay for better output visibility
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        flag[0] = false;
        flag[1] = false;
        turn = 0;

        Thread process0 = new Process(0);
        Thread process1 = new Process(1);

        process0.start();
        process1.start();
    }
}
