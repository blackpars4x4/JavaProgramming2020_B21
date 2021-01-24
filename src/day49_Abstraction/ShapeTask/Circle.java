package day49_Abstraction.ShapeTask;

public class Circle extends Shape {
    private double r;
    private double d;

    public final static double PI = 3.14;

    public Circle(double r) {
        super("Circle");
        if( r <= 0){
            throw new RuntimeException("No Such a circle with radius of "+r);
        }
        setR(r);
        setD( r * 2);
    }


    @Override
    public double area() {
        return r * r * PI;
    }

    @Override
    public double perimeter() {
        return d * PI;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }


}