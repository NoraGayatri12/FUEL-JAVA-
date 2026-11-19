interface Sample {
    void present();   // abstract method

    default void show() {
        System.out.println("This is default Method");
    }

    static void display() {
        System.out.println("This is Static Method");
    }
}

class First1 implements Sample {
    @Override
    public void present() {
        System.out.println("Abstract Method of Interface By Class");
    }
}

class Lambda {
    public static void main(String a[]) {

        First1 obj = new First1();

        obj.present();   // calling abstract method
        obj.show();      // default method
        Sample.display(); // static method

        // Lambda Expression
        Sample s=()->System.out.println("Abstract Method Of Functional Interface Implemented Directly By Lambda Expression");
        s.present();

    }
}