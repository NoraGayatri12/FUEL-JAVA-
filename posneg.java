import java.util.Scanner;
public class posneg{
    public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Number");
    int num=sc.nextInt();
    
    if(num>0){
        System.out.println("Positive Number");
    }
    else if(num<0){
        System.out.println("Negative Number");
    }
    else{
        System.out.println("Zero");
        
    }
    }
    
}
