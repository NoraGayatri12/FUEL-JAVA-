abstract class Employee{
    void show(){
        System.out.println("This is Abstract class");
    }
}
class Employee1 extends Employee{}

public class Abstraction1 {
    public static void main(String args[]){
        Employee1 obj=new Employee1();
        obj.show();
    }
}
