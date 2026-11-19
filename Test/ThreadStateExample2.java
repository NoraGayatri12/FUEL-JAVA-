class DemoThread extends Thread {
    public void run() {
        try {
            System.out.println("Thread started execution...");

            // Sleep for 2 seconds → TIMED_WAITING
            Thread.sleep(2000);

            System.out.println("Thread completed work");

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class ThreadStateExample2 {
    public static void main(String[] args) {
        DemoThread t1 = new DemoThread();

        // NEW state
        System.out.println("State after creating thread: " + t1.getState());

        t1.start();

        // RUNNABLE state
        System.out.println("State after starting thread: " + t1.getState());

        try {
            Thread.sleep(500);

            // TIMED_WAITING state
            System.out.println("State while thread is sleeping: " + t1.getState());

            // WAITING state (main thread waiting for t1)
            t1.join();

        } catch (InterruptedException e) {
            System.out.println(e);
        }

        // TERMINATED state
        System.out.println("State after thread execution: " + t1.getState());
    }
}