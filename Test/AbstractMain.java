// Abstract class
abstract class Shape {
    // Abstract method
    abstract void area();
}

class Circle extends Shape {
    double radius = 5;

    void area() {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

class Rectangle extends Shape {
    int length = 4;
    int breadth = 6;

    void area() {
        int result = length * breadth;
        System.out.println("Area of Rectangle: " + result);
    }
}

public class AbstractMain {
    public static void main(String[] args) {
        Shape s;

        s = new Circle();
        s.area();

        s = new Rectangle();
        s.area();
    }
}