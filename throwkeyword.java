import java.util.*;
public class throwkeyword {
    public static void main(String args[]){
        int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        x=sc.nextInt();
         System.out.println("Enter secound number");
        y=sc.nextInt();
        try{
        if(x==0||y==0){
            throw new ArithmeticException();
        }
        else{
            System.out.println(x+y);
        }
    }
    catch(ArithmeticException e){
        System.out.println("Arithmetic Exception");
    }

        

    }
}
