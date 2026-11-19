class MyException extends java.lang.Exception {
    MyException() {
        super("This is my custom exception");
    }
}

public class userdefineexception {
    public static void main(String args[]) {
        try {
            throw new MyException();
        } 
        catch (java.lang.Exception e) {
            System.out.println(e);
        }
    }
}