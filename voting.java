import java.util.*;
class VoteException extends java.lang.Exception{}
public class voting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age");
        int age=sc.nextInt();
        try{
        if(age<18){
            throw new VoteException();
        }
        else{
             System.out.println("Allowed for voting");
         }
    }
        catch(java.lang.Exception e){
            System.out.println("Invalid age");
        }
    }
}
