abstract class Employee{
    void show(){
        System.out.println("This is Abstract class");
    }
    abstract void present();

    
}
class Employee1 extends Employee{
    void present(){
        System.out.println("Abstract method implemented");
    }
}

public class Abstractionmethod {
    public static void main(String args[]){
        Employee1 obj=new Employee1();
        obj.show();
        obj.present();
    }
}
