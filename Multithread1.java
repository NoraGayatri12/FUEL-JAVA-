// Using Thread Class
class Thread1 extends Thread //Thread Class
{
    public void run(){
        System.out.println("My First Thread Start Operation");
    }
}
class Thread2 extends Thread{
     public void run(){
        System.out.println("My Second Thread Start Operation");
    }

}
public class Multithread1 {
    public static void main(String[] args) {
        Thread1 th=new Thread1();
        Thread2 th2=new Thread2();
        th.start();
        th2.start();

        
    }
}
