class Animal {
    void show(){
        System.out.println("It is Animal");
    }
}
class cat extends Animal{
    void Animal(){
        super.show();
        System.out.println("It is cat");
    }
}
class Superkey{
    public static void main(String args[]){
        cat obj=new cat();
        obj.Animal();

    }}
