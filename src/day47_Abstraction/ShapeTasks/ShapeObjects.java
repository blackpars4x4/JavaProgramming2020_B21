package day47_Abstraction.ShapeTasks;

public class ShapeObjects {
    public static void main(String[] args) {
        //Shape shape = new Shape("Shape");
        Circle circle = new Circle(3.5);
        System.out.println("Area of Circle " +circle.area());
        Rectangle rect = new Rectangle(3,5);
        System.out.println("rect.area() = " + rect.area());
        Square square = new Square(5);
        System.out.println("square.area() = " + square.area());
    }
}
