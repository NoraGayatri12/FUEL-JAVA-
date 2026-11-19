class Student{
    int roll_no;
    protected String name="Gayatri";
    void first(){
    System.out.println(name);
    }
}
class Student2 extends Student{
    void second(){
    System.out.println(name);
}
}
class Student3{
    String name="nora";
    void third(){
    System.out.println(name);
}
}


public class protectedex {
    public static void main(String args[]){
        Student2 obj=new Student2();
         Student3 a=new Student3();
        obj.first();
        obj.second();
        a.third();
        
    }
    
    
}
