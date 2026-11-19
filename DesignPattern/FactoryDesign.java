//Common 

// interface Animal{
//     void sound();
// }
// class Dog implements Animal{
//     public void sound(){
//         System.out.println("Bark");
//     }
// }
// class Cat implements Animal{
//     public void sound(){
//         System.out.println("Meow");
//     }
// }

// public class FactoryDesignPattern {
//     public static void main(String[] args) {
//         Dog d=new Dog();
//         d.sound();
//         Cat c=new Cat();
//         c.sound();
//     }
     
// }

// Using Factory Design Pattern

interface Animal{
    void sound();
}
class Dog implements Animal{
    public void sound(){
        System.out.println("Bark");
    }
}
class Cat implements Animal{
    public void sound(){
        System.out.println("Meow");
    }
}
class FactoryDesignPattern{
    public Animal getAnimal(String type){
        if(type.equalsIgnoreCase("dog"))
            return new Dog();
        if(type.equalsIgnoreCase("cat"))
            return new Cat();
        return null;
    }
}
class FactoryDesign {
    public static void main(String[] args) {
       FactoryDesignPattern factory=new FactoryDesignPattern();
       Animal obj=factory.getAnimal("dog");
       obj.sound();
    }
}        