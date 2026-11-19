class Student{
    int roll_no;
    private String name="Gayatri";
    void getname(){
        System.out.println(this.name);
    }
    void setname(String name){
        this.name=name;

    }
}

public class getsetmethod {
    public static void main(String args[]){
        Student obj=new Student();
        obj.getname();
        obj.setname("Nora");
        obj.getname();
    }
    
}
