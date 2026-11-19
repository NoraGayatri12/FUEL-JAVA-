class Thread1 extends Thread {
    public void run() {
        Thread t2 = new Thread2();

        try {
            t2.start();                  
            Thread.sleep(10000);          
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread2 State: " + t2.getState());
    }
}

class Thread2 extends Thread {
    public void run() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Thread3 extends Thread {}

public class LCOThread {
    public static void main(String args[]) {
        Thread t1 = new Thread1();

        System.out.println(t1.getState()); // NEW

        t1.start();

        try {
            Thread.sleep(10000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(t1.getState()); // RUNNABLE / TIMED_WAITING

        try {
            t1.join(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(t1.getState()); // TERMINATED
    }
}