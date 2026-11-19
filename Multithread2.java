// Using Runnable interface
class Thread1 implements Runnable{
    public void run(){
        System.out.println("This is Thread using Runnable interface");
    }
}
public class Multithread2 {
    public static void main(String[] args) {
        Thread1 t1=new Thread1();
        Thread th=new Thread(t1);
        th.start();
        
    }
}
