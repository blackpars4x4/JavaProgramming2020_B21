package day49_Abstraction.ShapeTask.ShapeTask;

public class Circle extends Shape {
    public double r;
    public double d;
    public final static double PI = 3.14;

    public Circle(double r) {
        super("Circle");
        if( r <= 0){
            throw new RuntimeException("No Such a circle with radius of "+r);
        }
        this.r = r;
        d = r * 2;
    }


    @Override
    public double area() {
        return r * r * PI;
    }

    @Override
    public double perimeter() {
        return d * PI;
    }
}