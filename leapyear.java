import java.util.Scanner;
public class leapyear{
    public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Year");
    int year=sc.nextInt();
    
    if(year%4==0){
        System.out.println("Leap year");
    }
    else{
        System.out.println("Not a leap year");
    }
    }
    
}
