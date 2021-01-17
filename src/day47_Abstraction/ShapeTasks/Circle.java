package day47_Abstraction.ShapeTasks;

public class Circle extends Shape{

    public final static double PI = 3.14;
    public double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * PI;
    }

    @Override
    public double perimeter() {
        return 2 * radius * PI;
    }
}
