import java.util.Scanner;
class Display{
    void sum(int a,int b){
        int c=a+b;
        System.out.println("sum="+c);
      }
}
public class input {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int a=sc.nextInt();
        System.out.println("Enter number2:");
        int b=sc.nextInt();
         Display obj=new Display();
        obj.sum(a,b);

    }
    
}
