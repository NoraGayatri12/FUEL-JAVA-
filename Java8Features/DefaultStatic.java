interface Sample {
    default void show() {
        System.out.println("This is default Method");
    }

    static void display() {
        System.out.println("This is Static Method");
    }
}

class First1 implements Sample {
}

class DefaultStatic {  
    public static void main(String a[]) {

        First1 obj = new First1();

        // Calling Default Method Of Interface
        obj.show();

        // Calling Static Method Of Interface
        Sample.display();
    }
}