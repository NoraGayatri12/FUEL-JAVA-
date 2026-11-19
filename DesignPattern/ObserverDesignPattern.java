// class Student{
//     void update(){
//         System.out.println("Class Starts At 10AM");
//     }
// }
// public class Simple{
//     public static void main(String[] args){
//     Student s1=new Student();
//     Student s2=new Student();
//     s1.update();
//     s2.update();
//  }
// }

// Using Observed Design Pattern(Behavioral Design pattern)

import java.util.ArrayList;
import java.util.List;

// Observer Interface
interface Observer {
    void update(String msg);
}

// Concrete Observer
class Student implements Observer {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void update(String msg) {
        System.out.println(name + " received: " + msg);
    }
}

// Subject (Teacher)
class Teacher {
    private List<Observer> students = new ArrayList<>();

    public void subscribe(Observer o) {
        students.add(o);
    }

    public void notifyStudents(String msg) {
        for (Observer s : students) {
            s.update(msg);
        }
    }
}

// Main Class
public class ObserverDesignPattern {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();

        teacher.subscribe(new Student("Gayatri"));
        teacher.subscribe(new Student("Vaishanavi"));
        teacher.subscribe(new Student("Pranita"));
        teacher.subscribe(new Student("Shweta"));

        teacher.notifyStudents("Tomorrow is your AMCAT exam at 9 AM");
    }
}