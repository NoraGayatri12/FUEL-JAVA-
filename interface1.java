interface Sample{
    int x=12;
    void show();
}
class Myclass implements Sample{
    @Override
    public void show(){
        System.out.println("Abstract method interface implemented");
    }

}
public class interface1 {
    public static void main(String args[]){
        Myclass obj=new Myclass();
        obj.show();
        System.out.println(Myclass.x);//without object create

    }
    
}
